package bs.commons.dimvars.core;

import java.util.ArrayList;
import java.util.HashMap;

import bs.commons.dimvars.exceptions.UnitException;

public class UnitData
{

	public static interface Unit
	{

		public UnitGroup getGroup();

		public UnitConversionMap getConversionMap();

		static void updateConversions(UnitConversionMap map)
		{
			updateConversions(map.getMap());
		}

		static void updateConversions(HashMap<Unit, Double[]> conversion_map)
		{
			for (Unit unit : conversion_map.keySet())
			{
				updateWithConversionFactors(unit, unit.getGroup(), conversion_map.get(unit));
			}
		}

		static void newUnitDetails(String name, String abbreviation, UnitData.Unit unit, UnitGroup unit_category)
		{
			UnitData det = new UnitData(unit, unit_category, name, abbreviation);
			if (details.containsKey(unit_category))
			{
				details.get(unit_category).put(unit, det);
				unitLists.get(unit_category).add(unit);
			} else
			{
				HashMap<UnitData.Unit, UnitData> detailMap = new HashMap<UnitData.Unit, UnitData>();
				ArrayList<UnitData.Unit> unitList = new ArrayList<UnitData.Unit>();
				unitList.add(unit);
				detailMap.put(unit, det);
				details.put(unit_category, detailMap);
				unitLists.put(unit_category, unitList);
			}
		}

	}

	private static final HashMap<UnitGroup, HashMap<UnitData.Unit, UnitData>> details = new HashMap<UnitGroup, HashMap<UnitData.Unit, UnitData>>();
	private static final HashMap<UnitGroup, ArrayList<UnitData.Unit>> unitLists = new HashMap<UnitGroup, ArrayList<UnitData.Unit>>();

	public final UnitGroup group;
	public final UnitData.Unit unit;
	private final HashMap<UnitData.Unit, Double> conversions;
	public final String unitName;
	public final String unitAbbreviation;

	protected UnitData(UnitData.Unit unit, UnitGroup group, String unit_name, String unit_abbreviation)
	{
		this.unit = unit;
		this.group = group;
		conversions = new HashMap<UnitData.Unit, Double>();
		unitName = unit_name;
		unitAbbreviation = unit_abbreviation;
	}

	public static UnitData getUnitData(UnitData.Unit unit) throws UnitException
	{
		try
		{
			UnitData data = details.get(unit.getGroup()).get(unit);
			if (data.conversions.size() == 0)
			{
				Unit.updateConversions(unit.getConversionMap());
				return getUnitData(unit);
			}
			return data;
		} catch (Exception e)
		{
			//IO.debug("Attempted to get unit " + unit.getClass());
			throw new UnitException("Non existant unit", e.getCause());
		}
	}

	public String getDescription()
	{
		return "(" + unitName + " : " + group.getType() + ")";
	}

	public Double getConversionFactor(UnitData.Unit output) throws UnitException
	{
		try
		{
			Double factor = conversions.get(output);
			return factor;
		} catch (Exception err)
		{
			throw new UnitException("Unable to get conversion factor : No conversion to " + getDescription());
		}
	}

	private static UnitData updateWithConversionFactors(UnitData.Unit unit, UnitGroup group, Double[] conversions)
	{
		UnitData oldDetails = getUnitDetails(unit, group);
		UnitData.Unit[] unitDefs = unitLists.get(group).toArray(new UnitData.Unit[unitLists.get(group).size()]);
		for (Integer unitIndex = 0; unitIndex < unitDefs.length; unitIndex++)
		{
			oldDetails.conversions.put(unitDefs[unitIndex], conversions[unitIndex]);
		}
		return oldDetails;

	}

	private static UnitData getUnitDetails(UnitData.Unit unit, UnitGroup group)
	{
		try
		{
			UnitData data = details.get(unit.getGroup()).get(unit);
			return data;
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.exit(1);
		return null;

	}

	public UnitData.Unit getUnit()
	{
		return unit;
	}

}
