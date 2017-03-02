package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum NoUnit implements Unit
{
	NONE(
		"NoUnit",
		"val");

	private NoUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.NONE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (NoUnit unit : NoUnit.values())
		{
			map.addConversions(unit, 1.0);
		}
		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.NONE;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}
}