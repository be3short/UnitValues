package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

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