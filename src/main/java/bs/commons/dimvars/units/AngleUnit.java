package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.core.UnitData.Unit;

public enum AngleUnit implements Unit
{

	RAD(
		"Radians",
		"rad"),
	DEG(
		"Degrees",
		"deg");

	private AngleUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.ANGLE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(AngleUnit.RAD, 1.0, 360.0 / (2 * Math.PI));
		map.addConversions(AngleUnit.DEG, (2 * Math.PI) / 360, 1.0);

		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.ANGLE;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}

}
