package bs.commons.unitvars.units;

import java.util.HashMap;

import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;

public class UnitGroupDefinitions
{

	public static enum SpeedUnit implements Unit
	{

		METERS_PER_SECOND(
			"Meters per Second",
			"m/s"),
		MPH(
			"Miles per Hour",
			"mi/hr");

		private SpeedUnit(String unit_name, String unit_abbreviation)
		{
			UnitData.newUnitDetails(unit_name, unit_abbreviation, this, UnitGroup.SPEED);
		}

		@Override
		public UnitGroup getGroup()
		{
			// TODO Auto-generated method stub
			return UnitGroup.SPEED;
		}

		@Override
		public void updateConversionMap()
		{
			// TODO Auto-generated method stub

		}
	}

	public static interface UnitDescription
	{

	}

	public static interface Unit
	{

		public UnitGroup getGroup();

		void updateConversionMap();

		public static void updateConversions(HashMap<Unit, Double[]> conversion_map)
		{
			for (Unit unit : conversion_map.keySet())
			{
				UnitData.updateWithConversionFactors(unit, unit.getGroup(), conversion_map.get(unit));
			}
		}

	}

	public static enum UnitGroup
	{
		SPEED(
			"Speed"),
		DISTANCE(
			"Distance");

		public final String category;

		private UnitGroup(String cat)
		{

			category = cat;
		}

	}

}
