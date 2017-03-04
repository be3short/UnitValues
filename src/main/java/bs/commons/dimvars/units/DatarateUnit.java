package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum DatarateUnit implements Unit
{
	BIT(
		"Bit",
		"bit"),
	BYTE(
		"Byte",
		"byte"),
	KILOBYTE(
		"Kilobyte",
		"kB"),
	MEGABYTE(
		"Megabyte",
		"MB"),
	GIGABYTE(
		"Gigabyte",
		"GB"),
	TERABYTE(
		"Terabyte",
		"TB"),
	PETABYTE(
		"Petabyte",
		"PB"),
	EXABYTE(
		"Exabyte",
		"EB"),
	ZETTABYTE(
		"Zettabyte",
		"ZB"),
	YOTTABYTE(
		"Yottabyte",
		"YB");

	public static final Double MemoryFactor = 1024.0;

	private DatarateUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.DATA_RATE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (DatarateUnit unit : DatarateUnit.values())
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
		// TODO Auto-generated method stub
		return UnitType.DATA_RATE;
	}

	public static void main(String[] args)
	{
		Unit byteVal = DatarateUnit.BYTE;
		Enum b = (Enum) byteVal;
		System.out.println(b.getClass().getSimpleName() + "." + b.name());
	}

	@Override
	public TimeUnit getRate()
	{
		return TimeUnit.SECOND;
	}
}