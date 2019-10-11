package RealFunctions {
	import ScalarValues::*;
	
	function Abs(x: Real): Real specializes NumericalFunctions::Abs;

	function '+'(x: Real, y: Real[0..1]): Real specializes NumericalFunctions::'+';
	function '-'(x: Real, y: Real[0..1]): Real specializes NumericalFunctions::'-';
	function '*'(x: Real, y: Real): Real specializes NumericalFunctions::'*';
	function '/'(x: Real, y: Real): Real specializes NumericalFunctions::'/';
	function '**'(x: Real, y: Real): Real specializes NumericalFunctions::'**';
	
	function '<'(x: Real, y: Real): Boolean specializes NumericalFunctions::'<';
	function '>'(x: Real, y: Real): Boolean specializes NumericalFunctions::'>';
	function '<='(x: Real, y: Real): Boolean specializes NumericalFunctions::'<=';
	function '>='(x: Real, y: Real): Boolean specializes NumericalFunctions::'>=';

	function Max(x: Real, y: Real): Real specializes NumericalFunctions::Max;
	function Min(x: Real, y: Real): Real specializes NumericalFunctions::Min;

	function '='(x: Real, y: Real): Boolean specializes BaseFunctions::'==';
	function '!='(x: Real, y: Real): Boolean specializes BaseFunctions::'!=';
	
	function Floor(x: Real): Integer;
	function Round(x: Real): Integer;
	
	function ToString(x: Real): String specializes BaseFunctions::ToString;
	function ToInteger(x: Real): Integer;
	function ToReal(x: String): Real;
	function ToComplex(x: Real): Complex;
}