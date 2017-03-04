package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.VelocityUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Velocityunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Velocity extends UnitValue
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
public Velocity(Double val,Unit unit)
{
super(val,unit,UnitType.VELOCITY);
}
	/*
	 * gets the value in Nanometers per Second
	 * 
	 * @returns value in Nanometers per Second
	 */
public Double nanometersPerSeconds()
{
return getValue(VelocityUnit.NANOMETERS_PER_SECOND);
}
	/*
	 * stores the value in Nanometers per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanometers per Second
	 */
public void nanometersPerSeconds(Double val)
{
setValue(val,VelocityUnit.NANOMETERS_PER_SECOND);
}
	/*
	 * Nanometers per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Velocity variable
	 */
public static Velocity newNanometersPerSecond(Double new_val)
{
return new Velocity(new_val,VelocityUnit.NANOMETERS_PER_SECOND);
}
	/*
	 * gets the value in Micrometers per Second
	 * 
	 * @returns value in Micrometers per Second
	 */
public Double micrometersPerSeconds()
{
return getValue(VelocityUnit.MICROMETERS_PER_SECOND);
}
	/*
	 * stores the value in Micrometers per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Micrometers per Second
	 */
public void micrometersPerSeconds(Double val)
{
setValue(val,VelocityUnit.MICROMETERS_PER_SECOND);
}
	/*
	 * Micrometers per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Velocity variable
	 */
public static Velocity newMicrometersPerSecond(Double new_val)
{
return new Velocity(new_val,VelocityUnit.MICROMETERS_PER_SECOND);
}
	/*
	 * gets the value in Millimeters per Second
	 * 
	 * @returns value in Millimeters per Second
	 */
public Double millimetersPerSeconds()
{
return getValue(VelocityUnit.MILLIMETERS_PER_SECOND);
}
	/*
	 * stores the value in Millimeters per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Millimeters per Second
	 */
public void millimetersPerSeconds(Double val)
{
setValue(val,VelocityUnit.MILLIMETERS_PER_SECOND);
}
	/*
	 * Millimeters per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Velocity variable
	 */
public static Velocity newMillimetersPerSecond(Double new_val)
{
return new Velocity(new_val,VelocityUnit.MILLIMETERS_PER_SECOND);
}
	/*
	 * gets the value in Meters per Second
	 * 
	 * @returns value in Meters per Second
	 */
public Double metersPerSeconds()
{
return getValue(VelocityUnit.METERS_PER_SECOND);
}
	/*
	 * stores the value in Meters per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Meters per Second
	 */
public void metersPerSeconds(Double val)
{
setValue(val,VelocityUnit.METERS_PER_SECOND);
}
	/*
	 * Meters per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Velocity variable
	 */
public static Velocity newMetersPerSecond(Double new_val)
{
return new Velocity(new_val,VelocityUnit.METERS_PER_SECOND);
}
	/*
	 * gets the value in Kilometers per Second
	 * 
	 * @returns value in Kilometers per Second
	 */
public Double kilometersPerSeconds()
{
return getValue(VelocityUnit.KILOMETERS_PER_SECOND);
}
	/*
	 * stores the value in Kilometers per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilometers per Second
	 */
public void kilometersPerSeconds(Double val)
{
setValue(val,VelocityUnit.KILOMETERS_PER_SECOND);
}
	/*
	 * Kilometers per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Velocity variable
	 */
public static Velocity newKilometersPerSecond(Double new_val)
{
return new Velocity(new_val,VelocityUnit.KILOMETERS_PER_SECOND);
}
}