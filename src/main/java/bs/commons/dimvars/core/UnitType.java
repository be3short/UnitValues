package bs.commons.dimvars.core;

public enum UnitType implements UnitGroup
{

	SPEED(
		"Speed"),
	DISTANCE(
		"Distance"),
	MEMORY(
		"Memory");

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
