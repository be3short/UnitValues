package bs.commons.unitvars.values;

import bs.commons.unitvars.core.UnitValue;
import bs.commons.unitvars.core.UnitData.Unit;
import bs.commons.unitvars.units.AngleUnit;
import bs.commons.unitvars.core.UnitType;

/**
 * Class that stores a value in Angleunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Angle extends UnitValue<Double>
{
	/*
	 * General Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly
	 */
public Angle(Double val,Unit unit)
{
super(val,unit,UnitType.ANGLE);
}
	/*
	 * gets the value in Radian
	 * 
	 * @returns value in Radian
	 */
public Double radians()
{
return getValue(AngleUnit.RADIAN);
}
	/*
	 * stores the value in Radian
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Radian
	 */
public void radians(Double val)
{
setValue(val,AngleUnit.RADIAN);
}
	/*
	 * Radian Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Angle variable
	 */
public static Angle newRadiansValue(Double new_val)
{
return new Angle(new_val,AngleUnit.RADIAN);
}
	/*
	 * Radian Constructor with zero value
* 
	 * @returns Angle variable
	 */
public static Angle newRadiansValue()
{
return new Angle(0.0,AngleUnit.RADIAN);
}
	/*
	 * gets the value in Degree
	 * 
	 * @returns value in Degree
	 */
public Double degrees()
{
return getValue(AngleUnit.DEGREE);
}
	/*
	 * stores the value in Degree
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Degree
	 */
public void degrees(Double val)
{
setValue(val,AngleUnit.DEGREE);
}
	/*
	 * Degree Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Angle variable
	 */
public static Angle newDegreesValue(Double new_val)
{
return new Angle(new_val,AngleUnit.DEGREE);
}
	/*
	 * Degree Constructor with zero value
* 
	 * @returns Angle variable
	 */
public static Angle newDegreesValue()
{
return new Angle(0.0,AngleUnit.DEGREE);
}
}