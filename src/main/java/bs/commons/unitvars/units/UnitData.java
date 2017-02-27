package bs.commons.unitvars.units;

import java.util.ArrayList;
import java.util.HashMap;

import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;
import bs.commons.unitvars.units.UnitGroupDefinitions.UnitDescription;
import bs.commons.unitvars.units.UnitGroupDefinitions.UnitGroup;
import bs.commons.unitvars.variables.AnyVar;

public class UnitData
{

	public static class UnitDataSet
	{

		private HashMap<Unit, UnitData> details;

		public UnitDataSet(HashMap<Unit, UnitData> unit_map)
		{
			details = unit_map;
		}

		public Double getConversionFactor(Unit from, Unit to)
		{
			return 1.0;
		}

		public Double getConversion(Unit from, Unit to, AnyVar var)
		{
			return 1.0;
		}
		//public Double conversionFactor(Unit from, Unit to);
	}

	private static final HashMap<UnitGroup, HashMap<Unit, UnitData>> details = new HashMap<UnitGroup, HashMap<Unit, UnitData>>();
	private static final HashMap<UnitGroup, ArrayList<Unit>> unitLists = new HashMap<UnitGroup, ArrayList<Unit>>();

	private final UnitGroup group;
	private final Unit unit;
	private final HashMap<Unit, Double> conversions;
	private final String unitName;
	private final String unitAbbreviation;

	private UnitData(Unit unit, UnitGroup group, String unit_name, String unit_abbreviation)
	{
		this.unit = unit;
		this.group = group;
		conversions = new HashMap<Unit, Double>();
		unitName = unit_name;
		unitAbbreviation = unit_abbreviation;
	}

	public static UnitData getUnitData(Unit unit)
	{
		UnitData data = details.get(unit.getGroup()).get(unit);
		if (data.conversions.size() == 0)
		{
			unit.updateConversionMap();
			return getUnitData(unit);
		}
		return data;
	}

	public Double getConversionFactor(Unit output)
	{
		Double factor = conversions.get(output);
		return factor;
	}
	//	private UnitData(Unit unit, UnitGroup group, Double[] conversions)
	//	{
	//		this.unit = unit;
	//		this.group = group;
	//		this.conversions = new HashMap<UnitDescription, Double>();
	//		for (Integer unitIndex = 0; unitIndex < unitDefs.length; unitIndex++)
	//		{
	//			this.conversions.put(unitDefs[unitIndex], conversions[unitIndex]);
	//		}
	//		enumName = enum_name;
	//		unitName = unit_name;
	//		unitAbbreviation = unit_abbreviation;
	//	}

	public static UnitData updateWithConversionFactors(Unit unit, UnitGroup group, Double[] conversions)
	{
		UnitData oldDetails = getUnitDetails(unit, group);
		Unit[] unitDefs = unitLists.get(group).toArray(new Unit[unitLists.get(group).size()]);
		for (Integer unitIndex = 0; unitIndex < unitDefs.length; unitIndex++)
		{
			oldDetails.conversions.put(unitDefs[unitIndex], conversions[unitIndex]);
		}
		//oldDetails.unitName, oldDetails.unitAbbreviation);
		//details.get(group).put(oldDetails.unit, newDetails);
		return oldDetails;

	}

	private static UnitData getUnitDetails(Unit unit, UnitGroup group)
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

	public static void newUnitDetails(String name, String abbreviation, Unit unit, UnitGroup unit_category)
	{
		UnitData det = new UnitData(unit, unit_category, name, abbreviation);
		if (details.containsKey(unit_category))
		{
			details.get(unit_category).put(unit, det);
			unitLists.get(unit_category).add(unit);
		} else
		{
			HashMap<Unit, UnitData> detailMap = new HashMap<Unit, UnitData>();
			ArrayList<Unit> unitList = new ArrayList<Unit>();
			unitList.add(unit);
			detailMap.put(unit, det);
			details.put(unit_category, detailMap);
			unitLists.put(unit_category, unitList);
		}
	}

}
