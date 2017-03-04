package bs.commons.dimvars.core;

/*
 * Enum that definies the different types of units 
 */
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
	ENERGY(
		"Energy"),
	TIME(
		"Time"),
	DATA_RATE(
		"Datarate"),
	NONE(
		"NoUnits"),;

	private final String typeName; // unit type name

	/*
	 * gets the type name
	 * 
	 * @return name of type
	 */
	@Override
	public String getType()
	{
		return typeName;
	}

	/*
	 * Constructor
	 * 
	 * @param name of type
	 */
	private UnitType(String type)
	{

		this.typeName = type;
	}

}
