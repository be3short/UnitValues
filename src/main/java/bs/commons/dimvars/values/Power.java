package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.PowerUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Powerunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Power extends UnitValue
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
public Power(Double val,Unit unit)
{
super(val,unit,UnitType.POWER);
}
	/*
	 * gets the value in Nanowatt
	 * 
	 * @returns value in Nanowatt
	 */
public Double nanowatts()
{
return getValue(PowerUnit.NANOWATT);
}
	/*
	 * stores the value in Nanowatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanowatt
	 */
public void nanowatts(Double val)
{
setValue(val,PowerUnit.NANOWATT);
}
	/*
	 * Nanowatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newNanowatt(Double new_val)
{
return new Power(new_val,PowerUnit.NANOWATT);
}
	/*
	 * gets the value in Microwatt
	 * 
	 * @returns value in Microwatt
	 */
public Double microwatts()
{
return getValue(PowerUnit.MICROWATT);
}
	/*
	 * stores the value in Microwatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Microwatt
	 */
public void microwatts(Double val)
{
setValue(val,PowerUnit.MICROWATT);
}
	/*
	 * Microwatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newMicrowatt(Double new_val)
{
return new Power(new_val,PowerUnit.MICROWATT);
}
	/*
	 * gets the value in Milliwatt
	 * 
	 * @returns value in Milliwatt
	 */
public Double milliwatts()
{
return getValue(PowerUnit.MILLIWATT);
}
	/*
	 * stores the value in Milliwatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Milliwatt
	 */
public void milliwatts(Double val)
{
setValue(val,PowerUnit.MILLIWATT);
}
	/*
	 * Milliwatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newMilliwatt(Double new_val)
{
return new Power(new_val,PowerUnit.MILLIWATT);
}
	/*
	 * gets the value in Watt
	 * 
	 * @returns value in Watt
	 */
public Double watts()
{
return getValue(PowerUnit.WATT);
}
	/*
	 * stores the value in Watt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Watt
	 */
public void watts(Double val)
{
setValue(val,PowerUnit.WATT);
}
	/*
	 * Watt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newWatt(Double new_val)
{
return new Power(new_val,PowerUnit.WATT);
}
	/*
	 * gets the value in Kilowatt
	 * 
	 * @returns value in Kilowatt
	 */
public Double kilowatts()
{
return getValue(PowerUnit.KILOWATT);
}
	/*
	 * stores the value in Kilowatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilowatt
	 */
public void kilowatts(Double val)
{
setValue(val,PowerUnit.KILOWATT);
}
	/*
	 * Kilowatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newKilowatt(Double new_val)
{
return new Power(new_val,PowerUnit.KILOWATT);
}
	/*
	 * gets the value in Megawatt
	 * 
	 * @returns value in Megawatt
	 */
public Double megawatts()
{
return getValue(PowerUnit.MEGAWATT);
}
	/*
	 * stores the value in Megawatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Megawatt
	 */
public void megawatts(Double val)
{
setValue(val,PowerUnit.MEGAWATT);
}
	/*
	 * Megawatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newMegawatt(Double new_val)
{
return new Power(new_val,PowerUnit.MEGAWATT);
}
	/*
	 * gets the value in Gigawatt
	 * 
	 * @returns value in Gigawatt
	 */
public Double gigawatts()
{
return getValue(PowerUnit.GIGAWATT);
}
	/*
	 * stores the value in Gigawatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gigawatt
	 */
public void gigawatts(Double val)
{
setValue(val,PowerUnit.GIGAWATT);
}
	/*
	 * Gigawatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newGigawatt(Double new_val)
{
return new Power(new_val,PowerUnit.GIGAWATT);
}
	/*
	 * gets the value in Terawatt
	 * 
	 * @returns value in Terawatt
	 */
public Double terawatts()
{
return getValue(PowerUnit.TERAWATT);
}
	/*
	 * stores the value in Terawatt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Terawatt
	 */
public void terawatts(Double val)
{
setValue(val,PowerUnit.TERAWATT);
}
	/*
	 * Terawatt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Power variable
	 */
public static Power newTerawatt(Double new_val)
{
return new Power(new_val,PowerUnit.TERAWATT);
}
}