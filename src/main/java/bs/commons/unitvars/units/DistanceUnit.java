package bs.commons.unitvars.units;

import java.util.HashMap;

import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;
import bs.commons.unitvars.units.UnitGroupDefinitions.UnitGroup;

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
		UnitData.newUnitDetails(unit_name, unit_abbreviation, this, UnitGroup.DISTANCE);
	}

	@Override
	public void updateConversionMap()
	{
		UnitConversionMap map = new UnitConversionMap();
		map.addConversions(DistanceUnit.METERS, 1.0, .001, 100.0);
		map.addConversions(DistanceUnit.KM, 100000.0, 1.0, 100.0);
		map.addConversions(DistanceUnit.CM, .00001, .001, 1.0);
		Unit.updateConversions(map.getMap());
	}

	@Override
	public UnitGroup getGroup()
	{
		// TODO Auto-generated method stub
		return UnitGroup.DISTANCE;
	}

}
