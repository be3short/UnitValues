package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.units.NoUnit;

/**
 * Class that stores a value without units. The purpose of this class is to
 * support classes that use unit values, but also need to handle values that
 * don't have any units
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Unitless extends UnitValue
{

	/*
	 * General Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly
	 */
	public Unitless(Double val, Unit unit)
	{
		super(val, unit, UnitType.NONE);
	}

	/*
	 * gets the value
	 * 
	 * @returns value
	 */
	public Double val()
	{
		return getValue(NoUnit.NONE);
	}

	/*
	 * stores the value in val
	 * 
	 * @param value to be stored
	 *
	 * @returns value in val
	 */
	public void val(Double val)
	{
		setValue(val, NoUnit.NONE);
	}
}