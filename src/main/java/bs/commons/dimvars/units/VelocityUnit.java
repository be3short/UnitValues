package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum VelocityUnit implements Unit
{
	NANOMETERS(
		"Nanometers",
		"nm"),
	MICROMETERS(
		"Micrometers",
		"um"),
	MILLIMETERS(
		"Millimeters",
		"mm"),
	METERS(
		"Meters",
		"m"),
	KILOMETERS(
		"Kilometers",
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
			conversions[place] = Math.pow(10, -(place - 4) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.VELOCITY;
	}

	@Override
	public TimeUnit getRate()
	{
		return TimeUnit.SECOND;
	}

}
