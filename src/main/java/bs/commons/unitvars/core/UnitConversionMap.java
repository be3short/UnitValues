package bs.commons.unitvars.core;

import java.util.HashMap;

public class UnitConversionMap
{

	private HashMap<UnitData.Unit, Double[]> conversionMap;

	public UnitConversionMap()
	{
		conversionMap = new HashMap<UnitData.Unit, Double[]>();
	}

	public void addConversions(UnitData.Unit unit, Double... conversion_factors)
	{
		conversionMap.put(unit, conversion_factors);
	}

	public HashMap<UnitData.Unit, Double[]> getMap()
	{
		return conversionMap;
	}
}
