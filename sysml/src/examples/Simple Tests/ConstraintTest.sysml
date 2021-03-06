package ConstraintTest {
	import ISQ::MassValue;
	import SI::kg;
	import ScalarFunctions::sum;
	
	constraint def MassAnalysis {
		attribute totalMass: MassValue;
		attribute componentMasses: MassValue[0..*];		

		totalMass == sum(componentMasses)
	}
	
	part def Component {
		attribute mass: MassValue;
	}
	
	part vehicle : Component {	
		part engine : Component;
		part frontAxleAssembly : Component;
		part rearAxleAssembly : Component;	
	}
		
	part vehicle1a :> vehicle {
		assert constraint massAnalysis : MassAnalysis {
			attribute redefines totalMass;
			attribute redefines componentMasses;
		}
		
		bind massAnalysis::totalMass = mass;
		bind massAnalysis::componentMasses[1] = engine::mass;
		bind massAnalysis::componentMasses[1] = frontAxleAssembly::mass;
		bind massAnalysis::componentMasses[1] = rearAxleAssembly::mass;
	}
	
	part vehicle1b :> vehicle {		
		assert constraint massAnalysis : MassAnalysis {
			attribute redefines totalMass = mass;
			attribute redefines componentMasses = {engine::mass, frontAxleAssembly::mass, rearAxleAssembly::mass};		
		}	
	}
		
	constraint def MassAnalysis2 (totalMass : MassValue, componentMasses: MassValue[0..*]) {
		totalMass == sum(componentMasses)
	}
	
	part vehicle2a :> vehicle {
		assert constraint massConstraint : MassAnalysis2 (totalMass, componentMasses);
		
		bind massConstraint::totalMass = mass;
		bind massConstraint::componentMasses[1] = engine::mass;
		bind massConstraint::componentMasses[1] = frontAxleAssembly::mass;
		bind massConstraint::componentMasses[1] = rearAxleAssembly::mass;
	}
		
	part vehicle2b :> vehicle {
		assert constraint massAnalysis2 : MassAnalysis2 (
			totalMass = mass,
			componentMasses = {engine::mass, frontAxleAssembly::mass, rearAxleAssembly::mass}
		);
	}
	
	constraint def MassAnalysis3 (totalMass : MassValue, componentMasses: MassValue[0..*]);
	
	constraint massAnalysis3 : MassAnalysis3 (totalMass : MassValue, componentMasses: MassValue[0..*]) {
		totalMass == sum(componentMasses)
	}
	
	part vehicle3 :> vehicle {
		assert massAnalysis3 (
			totalMass = mass,
			componentMasses = {engine::mass, frontAxleAssembly::mass, rearAxleAssembly::mass}
		);
	}
	
	part vehicle4 :> vehicle {
		assert constraint { mass == engine::mass + frontAxleAssembly::mass + rearAxleAssembly::mass }
	}
	
}