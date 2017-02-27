package bs.commons.unitvars.units;

import java.util.HashMap;

import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;

public class UnitConversionMap
{

	private HashMap<Unit, Double[]> conversionMap;

	public UnitConversionMap()
	{
		conversionMap = new HashMap<Unit, Double[]>();
	}

	public void addConversions(Unit unit, Double... conversion_factors)
	{
		conversionMap.put(unit, conversion_factors);
	}

	public HashMap<Unit, Double[]> getMap()
	{
		return conversionMap;
	}
}
