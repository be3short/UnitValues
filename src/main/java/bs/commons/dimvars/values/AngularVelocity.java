package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.AngularVelocityUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in AngularVelocityunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class AngularVelocity extends UnitValue<Double>
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
public AngularVelocity(Double val,Unit unit)
{
super(val,unit,UnitType.ANGULAR_VELOCITY);
}
	/*
	 * gets the value in Radians per Second
	 * 
	 * @returns value in Radians per Second
	 */
public Double radiansPerSecond()
{
return getValue(AngularVelocityUnit.RADIANS_PER_SEC);
}
	/*
	 * stores the value in Radians per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Radians per Second
	 */
public void radiansPerSecond(Double val)
{
setValue(val,AngularVelocityUnit.RADIANS_PER_SEC);
}
	/*
	 * Radians per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns AngularVelocity variable
	 */
public static AngularVelocity newRadiansPerSecondValue(Double new_val)
{
return new AngularVelocity(new_val,AngularVelocityUnit.RADIANS_PER_SEC);
}
	/*
	 * Radians per Second Constructor with zero value
* 
	 * @returns AngularVelocity variable
	 */
public static AngularVelocity newRadiansPerSecondValue()
{
return new AngularVelocity(0.0,AngularVelocityUnit.RADIANS_PER_SEC);
}
	/*
	 * gets the value in Degree per Second
	 * 
	 * @returns value in Degree per Second
	 */
public Double degreePerSecond()
{
return getValue(AngularVelocityUnit.DEGREES_PER_SEC);
}
	/*
	 * stores the value in Degree per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Degree per Second
	 */
public void degreePerSecond(Double val)
{
setValue(val,AngularVelocityUnit.DEGREES_PER_SEC);
}
	/*
	 * Degree per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns AngularVelocity variable
	 */
public static AngularVelocity newDegreePerSecondValue(Double new_val)
{
return new AngularVelocity(new_val,AngularVelocityUnit.DEGREES_PER_SEC);
}
	/*
	 * Degree per Second Constructor with zero value
* 
	 * @returns AngularVelocity variable
	 */
public static AngularVelocity newDegreePerSecondValue()
{
return new AngularVelocity(0.0,AngularVelocityUnit.DEGREES_PER_SEC);
}
}