package bs.commons.unitvars.values;

import bs.commons.unitvars.core.UnitValue;
import bs.commons.unitvars.core.UnitData.Unit;
import bs.commons.unitvars.units.DistanceUnit;
import bs.commons.unitvars.core.UnitType;

/**
 * Class that stores a value in Distanceunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Distance extends UnitValue<Double>
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
public Distance(Double val,Unit unit)
{
super(val,unit,UnitType.DISTANCE);
}
	/*
	 * gets the value in Nanometer
	 * 
	 * @returns value in Nanometer
	 */
public Double nanometers()
{
return getValue(DistanceUnit.NANOMETER);
}
	/*
	 * stores the value in Nanometer
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanometer
	 */
public void nanometers(Double val)
{
setValue(val,DistanceUnit.NANOMETER);
}
	/*
	 * Nanometer Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Distance variable
	 */
public static Distance newNanometersValue(Double new_val)
{
return new Distance(new_val,DistanceUnit.NANOMETER);
}
	/*
	 * Nanometer Constructor with zero value
* 
	 * @returns Distance variable
	 */
public static Distance newNanometersValue()
{
return new Distance(0.0,DistanceUnit.NANOMETER);
}
	/*
	 * gets the value in Micrometer
	 * 
	 * @returns value in Micrometer
	 */
public Double micrometers()
{
return getValue(DistanceUnit.MICROMETER);
}
	/*
	 * stores the value in Micrometer
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Micrometer
	 */
public void micrometers(Double val)
{
setValue(val,DistanceUnit.MICROMETER);
}
	/*
	 * Micrometer Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Distance variable
	 */
public static Distance newMicrometersValue(Double new_val)
{
return new Distance(new_val,DistanceUnit.MICROMETER);
}
	/*
	 * Micrometer Constructor with zero value
* 
	 * @returns Distance variable
	 */
public static Distance newMicrometersValue()
{
return new Distance(0.0,DistanceUnit.MICROMETER);
}
	/*
	 * gets the value in Millimeter
	 * 
	 * @returns value in Millimeter
	 */
public Double millimeters()
{
return getValue(DistanceUnit.MILLIMETER);
}
	/*
	 * stores the value in Millimeter
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Millimeter
	 */
public void millimeters(Double val)
{
setValue(val,DistanceUnit.MILLIMETER);
}
	/*
	 * Millimeter Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Distance variable
	 */
public static Distance newMillimetersValue(Double new_val)
{
return new Distance(new_val,DistanceUnit.MILLIMETER);
}
	/*
	 * Millimeter Constructor with zero value
* 
	 * @returns Distance variable
	 */
public static Distance newMillimetersValue()
{
return new Distance(0.0,DistanceUnit.MILLIMETER);
}
	/*
	 * gets the value in Meter
	 * 
	 * @returns value in Meter
	 */
public Double meters()
{
return getValue(DistanceUnit.METER);
}
	/*
	 * stores the value in Meter
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Meter
	 */
public void meters(Double val)
{
setValue(val,DistanceUnit.METER);
}
	/*
	 * Meter Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Distance variable
	 */
public static Distance newMetersValue(Double new_val)
{
return new Distance(new_val,DistanceUnit.METER);
}
	/*
	 * Meter Constructor with zero value
* 
	 * @returns Distance variable
	 */
public static Distance newMetersValue()
{
return new Distance(0.0,DistanceUnit.METER);
}
	/*
	 * gets the value in Kilometer
	 * 
	 * @returns value in Kilometer
	 */
public Double kilometers()
{
return getValue(DistanceUnit.KILOMETER);
}
	/*
	 * stores the value in Kilometer
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilometer
	 */
public void kilometers(Double val)
{
setValue(val,DistanceUnit.KILOMETER);
}
	/*
	 * Kilometer Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Distance variable
	 */
public static Distance newKilometersValue(Double new_val)
{
return new Distance(new_val,DistanceUnit.KILOMETER);
}
	/*
	 * Kilometer Constructor with zero value
* 
	 * @returns Distance variable
	 */
public static Distance newKilometersValue()
{
return new Distance(0.0,DistanceUnit.KILOMETER);
}
}