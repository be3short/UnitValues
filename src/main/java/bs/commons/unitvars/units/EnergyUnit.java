package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

public enum EnergyUnit implements Unit
{
	WATT_HOUR(
		"Watt Hour",
		"wH"),
	MILIAMP_HOUR(
		"Miliamp Hour",
		"mAh");

	private EnergyUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.ENERGY);

	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();
		for (EnergyUnit unit : EnergyUnit.values())
		{
			map.addConversions(unit, getDistanceConversionArray(unit.ordinal()));
		}
		return map;
	}

	public Double[] getDistanceConversionArray(Integer multiplier_index)
	{
		Double[] conversions = new Double[EnergyUnit.values().length];
		for (Integer place = 0; place < conversions.length; place++)
		{
			conversions[place] = Math.pow(10, -(place - 3) * 3);
		}

		return conversions;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.ENERGY;
	}

}
