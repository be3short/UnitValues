package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.units.TimeUnit;

/*
 * DUV stands for Dynamic Unit Value where the value is definined by the class T.  A dynamic unit value is a value with units that changes continuously.  This class allows for a value and it's derivative to be stored as unit values.
 */
public class DynamicVal<T>
{

	private T value;

	private T derivative;

	public DynamicVal(T val, T der)
	{
		value = val;
		derivative = der;
	}

	public T v()
	{
		return value;
	}

	public void v(T new_value)
	{
		value = new_value;
	}

	public T d()
	{
		return derivative;
	}

	public void d(T new_value)
	{
		derivative = new_value;
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

	public static Double derivative(DynamicVal var)
	{
		return ((UnitValue) var.derivative).getValue(((UnitValue) var.value).unit, TimeUnit.SECOND);
	}

	public static Double value(DynamicVal var)
	{
		try
		{
			return ((UnitValue) var.value).getValue(((UnitValue) var.value).unit, TimeUnit.SECOND);
		} catch (Exception e)
		{
			return null;
		}
	}

	public static void setValue(DynamicVal var, Double val)
	{
		((UnitValue) var.value).setValue(val, ((UnitValue) var.value).unit);
	}

	public static void removeDerivative(DynamicVal var)
	{
		var.d(null);
	}
}
