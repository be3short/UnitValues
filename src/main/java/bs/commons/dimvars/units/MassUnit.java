package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.core.UnitData.Unit;

public enum MassUnit implements Unit
{

	GRAMS(
		"Grams",
		"g"),
	KILOGRAMS(
		"Kilograms",
		"kg");

	private MassUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.MASS);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(MassUnit.GRAMS, 1.0, 1000.0);
		map.addConversions(MassUnit.KILOGRAMS, .001, 1.0);

		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.MASS;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}

}
