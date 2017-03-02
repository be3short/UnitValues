package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum CurrentUnit implements Unit
{
	NANOAMP(
		"Nanoamp",
		"nA"),
	MICROAMP(
		"Microamp",
		"uA"),
	MILLIAMP(
		"Milliamp",
		"mA"),
	AMP(
		"amp",
		"A"),
	KILO_AMP(
		"Kilo-amp",
		"kA"),
	MEGA_AMP(
		"Mega-amp",
		"MA"),
	GIGA_AMP(
		"Giga-amp",
		"GA");

	private CurrentUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.CURRENT);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (CurrentUnit unit : CurrentUnit.values())
		{
			map.addConversions(unit, getVoltageConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getVoltageConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[CurrentUnit.values().length];
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
		return UnitType.CURRENT;
	}

	@Override
	public TimeUnit getRate()
	{
		return null;
	}

	public static void main(String args[])
	{

	}
}