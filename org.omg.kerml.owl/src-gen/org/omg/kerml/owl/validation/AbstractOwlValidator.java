/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractOwlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.omg.kerml.owl.owl.OwlPackage.eINSTANCE);
		return result;
	}
}
