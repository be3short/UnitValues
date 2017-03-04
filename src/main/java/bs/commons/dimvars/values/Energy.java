package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.core.UnitValue;

/**
 * Class that stores a value in Energyunits. This value can be extracted or
 * updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Energy extends UnitValue
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
	public Energy(Double val, Unit unit)
	{
		super(val, unit, UnitType.ENERGY);
	}
}