package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.NoUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in NoUnitsunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class NoUnits extends UnitValue
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
public NoUnits(Double val,Unit unit)
{
super(val,unit,UnitType.NONE);
}
	/*
	 * gets the value in val
	 * 
	 * @returns value in val
	 */
public Double vals()
{
return getValue(NoUnit.NONE);
}
	/*
	 * stores the value in val
	 * 
	 *@param value to be stored
	 *
	 * @returns value in val
	 */
public void vals(Double val)
{
setValue(val,NoUnit.NONE);
}
	/*
	 * val Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns NoUnits variable
	 */
public static NoUnits newVal(Double new_val)
{
return new NoUnits(new_val,NoUnit.NONE);
}
}