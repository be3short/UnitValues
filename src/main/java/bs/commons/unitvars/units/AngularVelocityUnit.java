package bs.commons.unitvars.units;

import bs.commons.unitvars.core.UnitConversionMap;
import bs.commons.unitvars.core.UnitGroup;
import bs.commons.unitvars.core.UnitType;
import bs.commons.unitvars.core.UnitData.Unit;

public enum AngularVelocityUnit implements Unit
{

	RADIANS_PER_SEC(
		"Radians per Second",
		"rad/s"),
	DEGREES_PER_SEC(
		"Degree per Second",
		"deg/s");

	private AngularVelocityUnit(String unit_name, String unit_abbreviation)
	{
		Unit.newUnitDetails(unit_name, unit_abbreviation, this, UnitType.ANGULAR_VELOCITY);
	}

	@Override
	public UnitConversionMap getConversionMap()
	{

		UnitConversionMap map = new UnitConversionMap();

		map.addConversions(AngularVelocityUnit.RADIANS_PER_SEC, 1.0, 360.0 / (2 * Math.PI));
		map.addConversions(AngularVelocityUnit.DEGREES_PER_SEC, (2 * Math.PI) / 360, 1.0);

		return map;
	}

	@Override
	public UnitGroup getGroup()
	{
		return UnitType.ANGULAR_VELOCITY;
	}

}
