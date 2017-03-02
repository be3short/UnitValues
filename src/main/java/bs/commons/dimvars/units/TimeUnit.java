package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum TimeUnit implements Unit
{
	NANOSECOND(
		"Nanosecond",
		"nS"),
	MICROSECOND(
		"Microsecond",
		"us"),
	MILLISECOND(
		"Millisecond",
		"ms"),
	SECOND(
		"Second",
		"s"),
	MINUTE(
		"Minute",
		"min"),
	HOUR(
		"Hour",
		"hr");

	public static final Double MemoryFactor = 1024.0;

	private TimeUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.TIME);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(TimeUnit.NANOSECOND, 1.0, Math.pow(10, -3), Math.pow(10, -6), Math.pow(10, -9),
		Math.pow(10, -9) / 60, Math.pow(10, 9) / Math.pow(60, 2));
		map.addConversions(TimeUnit.MICROSECOND, Math.pow(10, 3), 1.0, Math.pow(10, -3), Math.pow(10, -6),
		Math.pow(10, -6) / 60, Math.pow(10, -6) / Math.pow(60, 2));
		map.addConversions(TimeUnit.MILLISECOND, Math.pow(10, 6), Math.pow(10, 3), 1.0, Math.pow(10, -3),
		Math.pow(10, -3) / 60, Math.pow(10, -3) / Math.pow(60, 2));
		map.addConversions(TimeUnit.SECOND, Math.pow(10, 9), Math.pow(10, 6), Math.pow(10, 3), 1.0, 1.0 / 60,
		1.0 / Math.pow(60, 2));
		map.addConversions(TimeUnit.MINUTE, Math.pow(10, 9) * Math.pow(60, 1), Math.pow(10, 6) * Math.pow(60, 1),
		Math.pow(10, 3) * Math.pow(60, 1), Math.pow(60, 1), 1.0, 60.0);
		map.addConversions(TimeUnit.HOUR, Math.pow(10, 9) * Math.pow(60, 2), Math.pow(10, 6) * Math.pow(60, 2),
		Math.pow(10, 3) * Math.pow(60, 2), Math.pow(60, 2), 60.0, 1.0);

		return map;
	}

	public Double[] getByteConversionArray(Integer multiplier_index)
	{
		Double bitMult = 1.0;
		if (multiplier_index == 0)
		{
			bitMult = 8.0;
		}
		Double[] conversions = new Double[10];
		for (Integer place = 1; place < 10; place++)
		{
			conversions[place] = bitMult * Math.pow(1024, (place - multiplier_index - 1));
		}
		conversions[0] = bitMult * conversions[1] / 8;
		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.TIME;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}
}