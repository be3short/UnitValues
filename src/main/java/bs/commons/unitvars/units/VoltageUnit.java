package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

public enum VoltageUnit implements Unit
{
	NANOVOLT(
		"Nanovolt",
		"nV"),
	MICROVOLT(
		"Microvolt",
		"uV"),
	MILLIVOLT(
		"Millivolt",
		"mV"),
	VOLT(
		"Volt",
		"V"),
	KILOVOLT(
		"Kilovolt",
		"kV"),
	MEGAVOLT(
		"Megavolt",
		"MV"),
	GIGAVOLT(
		"Gigavolt",
		"GV");

	private VoltageUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.VOLTAGE);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (VoltageUnit unit : VoltageUnit.values())
		{
			map.addConversions(unit, getVoltageConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getVoltageConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[VoltageUnit.values().length];
		for (Integer place = 0; place < conversions.length; place++)
		{
			conversions[place] = Math.pow(10, -(place - 4) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.VOLTAGE;
	}

}