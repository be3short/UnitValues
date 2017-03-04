package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;

public enum VelocityUnit implements Unit
{
	NANOMETERS_PER_SECOND(
		"Nanometers per Second",
		"nm"),
	MICROMETERS_PER_SECOND(
		"Micrometers per Second",
		"um"),
	MILLIMETERS_PER_SECOND(
		"Millimeters per Second",
		"mm"),
	METERS_PER_SECOND(
		"Meters per Second",
		"m"),
	KILOMETERS_PER_SECOND(
		"Kilometers per Second",
		"km");

	private VelocityUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.VELOCITY);

	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (VelocityUnit unit : VelocityUnit.values())
		{
			map.addConversions(unit, getDistanceConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getDistanceConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[VelocityUnit.values().length];
		for (Integer place = 0; place < conversions.length; place++)
		{
			conversions[place] = Math.pow(10, -(place - 3) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.VELOCITY;
	}

}
