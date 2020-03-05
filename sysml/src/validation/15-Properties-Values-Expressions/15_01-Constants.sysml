package '15_01-Constants' {
    import SI::*;
    import USCustomaryUnits::*;

    /* Math and physical constants should be defined in the model library. */
    
     /**
     Examples of mathematical constants
     Note: There should be a way to mark these as "invariant" 
     */
    package 'Mathematical Constants' {
        value e: Real = 2.71828182845904523536;
        value pi: Real = 3.14159265358979323846;
    }

    /**
     * Should this be in the ISQ library model?
     */
    value type DimensionOneValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
    	ref scale: UnitOfDimensionOne redefines QuantityValue::scale;
    }
    
    /**
     * Should this ibe in the ISQ library model?
     */
    block AccelerationUnit :> SIDerivedUnit {
		value lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :> SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}		
    }
    value type AccelerationValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
    	ref scale: AccelerationUnit redefines QuantityValue::scale;
    }

    /**
     Examples of fundamental physical constants
     Note: There should be a way to mark these as "invariant" 
     */
    /**
     * The reference source is:
     CODATA - Task Group on Fundamental Physical Constants (TGFC) - 2010 Recommended Values - See http://www.codata.org/committees-and-groups/fundamental-physical-constants/tgfc-previous-values-and-publications
     */
    package 'Fundamental Physical Constants' {
        value 'fine structure constant': DimensionOneValue = 7.297352569824E-3;
        value 'electron to proton mass ratio': DimensionOneValue = 5.446170217822E-4;
        value 'speed of light in vacuum': SpeedValue = 299792458@[m/s];
    }

    package 'Global Context' {
        value 'nominal earth gravitational acceleration': AccelerationValue = 9.80665@[m/(s^2)];
    }

    package 'Model X Context' {
        value 'amplifier gain': DimensionOneValue = 3.5;
    }

}