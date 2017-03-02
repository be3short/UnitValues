package bs.commons.dimvars.units;

import java.util.HashMap;

import bs.commons.dimvars.core.UnitConversionMap;
import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitGroup;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.core.UnitType;

public enum DistanceUnit implements Unit
{
	METERS(
		"Meters",
		"m"),
	KM(
		"Kilometers",
		"km"),
	CM(
		"Centimeters",
		"cm");

	private DistanceUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.DISTANCE);

	}

	@Override
	public UnitConversionMap getConversionMap()
	{
		UnitConversionMap map = new UnitConversionMap();
		map.addConversions(DistanceUnit.METERS, 1.0, .001, 100.0);
		map.addConversions(DistanceUnit.KM, 100000.0, 1.0, 100.0);
		map.addConversions(DistanceUnit.CM, .00001, .001, 1.0);
		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitType.DISTANCE;
	}

}
