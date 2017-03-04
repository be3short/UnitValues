package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;

public enum NoUnit implements Unit
{
	NONE(
		"val",
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
		return UnitType.NONE;
	}

}