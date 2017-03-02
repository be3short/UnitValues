package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.values.Power;

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
		"watt",
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
		"Gigawatt",
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
	public TimeUnit getRate()
	{
		return null;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.POWER;
	}

	public static void main(String args[])
	{
		Power p = new Power(2.0, PowerUnit.MILLIWATT);
		System.out.println(p.W());
		System.out.println(p.kW());
	}
}