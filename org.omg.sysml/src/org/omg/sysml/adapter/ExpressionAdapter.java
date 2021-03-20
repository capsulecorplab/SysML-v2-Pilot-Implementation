/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;

public class ExpressionAdapter extends StepAdapter {

	public static final String EXPRESSION_SUBSETTING_BASE_DEFAULT = "Performances::evaluations";
	public static final String EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT = "Performances::Performance::subevaluations";
	
	public static final String EXPRESSION_GUARD_FEATURE = "TransitionPerformances::TransitionPerformance::guard";

	public ExpressionAdapter(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getTarget() {
		return (Expression)super.getTarget();
	}
	
	// Utility
	
	public Type getExpressionType() {
		return getTarget().getFunction();
	}		
	
	public List<Feature> getTypeParameters() {
		Type type = getExpressionType();
		return type == null? Collections.emptyList():
			   type.getInput().stream().
				filter(input->FeatureUtil.isParameter(input) && input.getOwner() == type).
				collect(Collectors.toList());
	}
	
	// Implicit Generalization
	
	@Override
	protected String getDefaultSupertype() {
		return FeatureUtil.isCompositePerformanceFeature(getTarget())?
				EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT:
				EXPRESSION_SUBSETTING_BASE_DEFAULT;
	}
	
	// Computed Redefinition

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		Expression target = getTarget();
		Type owningType = target.getOwningType();
		return ExpressionUtil.isTransitionGuard(target)?
					type == owningType? Collections.singletonList(target):
					Collections.singletonList((Feature)getLibraryType(EXPRESSION_GUARD_FEATURE)):
			   owningType instanceof FeatureValue? Collections.emptyList():
			   super.getRelevantFeatures(type);
	}
	
	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		Expression target = getTarget();
		Type owningType = target.getOwningType();
		return ExpressionUtil.isTransitionGuard(target) && type == owningType?
				Collections.singletonList(getLibraryType(TransitionUsageAdapter.TRANSITION_USAGE_SUBSETTING_DEFAULT)):
				super.getGeneralTypes(type, skip);
	}
	
	// Transformation

	protected Feature createFeatureForParameter(Feature parameter) {
		if (parameter == null) {
			return null;
		} else {
			Expression expression = getTarget();
			Feature feature = SysMLFactory.eINSTANCE.createFeature();
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberFeature(feature);
			membership.setMemberName("$" + parameter.getName());
			expression.getOwnedRelationship().add(membership);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}			
			return feature;
		}
	}
	
	protected void computeInput() {
		if (getTarget().getInput().isEmpty()) {
			for (Feature parameter: getTypeParameters()) {
				createFeatureForParameter(parameter);
			}
		}
	}
	
	protected void computeOutput() {
		Expression expression = getTarget();
		if (expression.getOutput().isEmpty()) {
			Feature parameter = SysMLFactory.eINSTANCE.createFeature();
			ParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter(parameter);
			membership.setMemberName("$result");
			expression.getOwnedRelationship().add(membership);
		}		
	}
			
	@Override
	public void doTransform() {
		Expression expression = getTarget();
		super.doTransform();
		if (expression.getOwningNamespace() instanceof Multiplicity || 
				expression.getOwningMembership() instanceof FeatureValue) {
			addImplicitFeaturingTypesIfNecessary();
		}
		computeInput();
		computeOutput();
		createResultConnector(getTarget().getResult());
	}
		
}
