package bs.commons.dimvars.units;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitType;

public enum PowerUnit implements Unit
{
	NANOWATT(
		"Nanowatt",
		"nW"),
	MICROWATT(
		"Microwatt",
		"uW"),
	MILLIWATT(
		"Milliwatt",
		"mW"),
	WATT(
		"Watt",
		"W"),
	KILOWATT(
		"Kilowatt",
		"kW"),
	MEGAWATT(
		"Megawatt",
		"MW"),
	GIGAWATT(
		"Gigawatt",
		"GW"),
	TERAWATT(
		"Terawatt",
		"TW");

	private PowerUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.POWER);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (PowerUnit unit : PowerUnit.values())
		{
			map.addConversions(unit, getPowerConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getPowerConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[PowerUnit.values().length];
		for (Integer place = 0; place < conversions.length; place++)
		{
			conversions[place] = Math.pow(10, -(place - 2) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.POWER;
	}
}