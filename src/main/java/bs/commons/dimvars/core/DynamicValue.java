package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.units.TimeUnit;

/*
 * DUV stands for Dynamic Unit Value where the value is definined by the class T.  A dynamic unit value is a value with units that changes continuously.  This class allows for a value and it's derivative to be stored as unit values.
 */
public class DynamicValue<T>
{

	private T value;

	private T derivative;

	public DynamicValue(T val, T der)
	{
		value = val;
		derivative = der;
	}

	public T v()
	{
		return value;
	}

	public T d()
	{
		return derivative;
	}

	//	public Double value()
	//	{
	//		return value.getValue(value.unit);
	//	}
	//
	//	public Double derivative()
	//	{
	//		return derivative.getValue(value.unit);
	//	}
	//
	//	public void value(Double val)
	//	{
	//		value.setValue(val, value.unit);
	//	}
	//
	//	public void derivative(Double val)
	//	{
	//		derivative.setValue(val, value.unit);
	//	}

	public static Double derivative(DynamicValue var)
	{
		return ((UnitVal) var.derivative).getValue(((UnitVal) var.value).unit, TimeUnit.SECOND);
	}

	public static Double value(DynamicValue var)
	{
		return ((UnitVal) var.value).getValue(((UnitVal) var.value).unit, TimeUnit.SECOND);
	}

	public static void setValue(DynamicValue var, Double val)
	{
		((UnitVal) var.value).setValue(val, ((UnitVal) var.value).unit);
	}

	public static void removeDerivative(DynamicValue var)
	{
		var.derivative = null;
	}
}
