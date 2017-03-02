package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.values.Distance;
import bs.commons.dimvars.core.UnitType;

public enum DistanceUnit implements Unit
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
		// TODO Auto-generated method stub
		return UnitType.DISTANCE;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}

	public static void main(String args[])
	{
		Distance d = new Distance(1000.0, DistanceUnit.MILLIMETERS);
		System.out.println(d.m());
		System.out.println(d.km());
		System.out.println(d.um());

	}
}
