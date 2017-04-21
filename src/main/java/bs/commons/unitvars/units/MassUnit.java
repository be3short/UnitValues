package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

public enum MassUnit implements Unit
{

	GRAM(
		"Gram",
		"g"),
	KILOGRAM(
		"Kilogram",
		"kg");

	private MassUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.MASS);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(MassUnit.GRAM, 1.0, 1000.0);
		map.addConversions(MassUnit.KILOGRAM, .001, 1.0);

		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.MASS;
	}

}
