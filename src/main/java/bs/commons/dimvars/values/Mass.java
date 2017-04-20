package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.MassUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Massunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Mass extends UnitValue<Double>
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
public Mass(Double val,Unit unit)
{
super(val,unit,UnitType.MASS);
}
	/*
	 * gets the value in Gram
	 * 
	 * @returns value in Gram
	 */
public Double grams()
{
return getValue(MassUnit.GRAM);
}
	/*
	 * stores the value in Gram
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gram
	 */
public void grams(Double val)
{
setValue(val,MassUnit.GRAM);
}
	/*
	 * Gram Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Mass variable
	 */
public static Mass newGramsValue(Double new_val)
{
return new Mass(new_val,MassUnit.GRAM);
}
	/*
	 * Gram Constructor with zero value
* 
	 * @returns Mass variable
	 */
public static Mass newGramsValue()
{
return new Mass(0.0,MassUnit.GRAM);
}
	/*
	 * gets the value in Kilogram
	 * 
	 * @returns value in Kilogram
	 */
public Double kilograms()
{
return getValue(MassUnit.KILOGRAM);
}
	/*
	 * stores the value in Kilogram
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilogram
	 */
public void kilograms(Double val)
{
setValue(val,MassUnit.KILOGRAM);
}
	/*
	 * Kilogram Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Mass variable
	 */
public static Mass newKilogramsValue(Double new_val)
{
return new Mass(new_val,MassUnit.KILOGRAM);
}
	/*
	 * Kilogram Constructor with zero value
* 
	 * @returns Mass variable
	 */
public static Mass newKilogramsValue()
{
return new Mass(0.0,MassUnit.KILOGRAM);
}
}