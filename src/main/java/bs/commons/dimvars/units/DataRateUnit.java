package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;

public enum DataRateUnit implements Unit
{
	BITS_PER_SEC(
		"Bits per Second",
		"bit/s"),
	BYTES_PER_SEC(
		"Bytes per Second",
		"byte/s"),
	KILOBYTES_PER_SEC(
		"Kilobytes per Second",
		"kB/s"),
	MEGABYTES_PER_SEC(
		"Megabytes per Second",
		"MB/s"),
	GIGABYTES_PER_SEC(
		"Gigabytes per Second",
		"GB/s"),
	TERABYTES_PER_SEC(
		"Terabytes per Second",
		"TB/s"),
	PETABYTES_PER_SEC(
		"Petabytes per Second",
		"PB/s"),
	EXABYTES_PER_SEC(
		"Exabytes per Second",
		"EB/s"),
	ZETTABYTES_PER_SEC(
		"Zettabytes per Second",
		"ZB/s"),
	YOTTABYTES_PER_SEC(
		"Yottabytes per Second",
		"YB/s");

	public static final Double MemoryFactor = 1024.0;

	private DataRateUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.DATA_RATE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (DataRateUnit unit : DataRateUnit.values())
		{
			map.addConversions(unit, getByteConversionArray(unit.ordinal()));
		}
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
		return UnitType.DATA_RATE;
	}

}