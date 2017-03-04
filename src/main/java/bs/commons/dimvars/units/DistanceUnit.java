package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;

public enum DistanceUnit implements Unit
{
	NANOMETER(
		"Nanometer",
		"nm"),
	MICROMETER(
		"Micrometer",
		"um"),
	MILLIMETER(
		"Millimeter",
		"mm"),
	METER(
		"Meter",
		"m"),
	KILOMETER(
		"Kilometer",
		"km");

	private DistanceUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.DISTANCE);

	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (DistanceUnit unit : DistanceUnit.values())
		{
			map.addConversions(unit, getDistanceConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getDistanceConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[DistanceUnit.values().length];
		for (Integer place = 0; place < conversions.length; place++)
		{
			conversions[place] = Math.pow(10, -(place - 3) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.DISTANCE;
	}

}
