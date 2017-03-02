package bs.commons.dimvars.core;

public enum UnitType implements UnitGroup
{

	DISTANCE(
		"Distance"),
	VELOCITY(
		"Velocity"),
	ANGLE(
		"Angle"),
	MASS(
		"Mass"),
	MEMORY(
		"Memory"),
	VOLTAGE(
		"Voltage"),
	CURRENT(
		"Current"),
	POWER(
		"Power"),
	TIME(
		"Time"),
	DATA_RATE(
		"Datarate"),
	NONE(
		"NoUnits"),;

	private final String category;

	@Override
	public String getCategory()
	{
		return category;
	}

	private UnitType(String cat)
	{

		category = cat;
	}

}
