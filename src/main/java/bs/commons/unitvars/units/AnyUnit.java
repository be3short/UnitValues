package bs.commons.unitvars.units;

import java.util.ArrayList;
import java.util.HashMap;

import bs.commons.unitvars.units.UnitData.UnitDataSet;
import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;
import bs.commons.unitvars.units.UnitGroupDefinitions.UnitGroup;

public class AnyUnit
{

	//private static HashMap<UnitGroup, HashMap<Unit, UnitData>> unitData new HashMap<UnitGroup,HashMap<Unit,UnitData>>();
	private Unit unit;
	//private UnitGroup group;

	//private static UnitDataSet properties = null;
	public AnyUnit(Unit unit)
	{
		this.unit = unit;
	}

	public AnyUnit(UnitGroup group, HashMap<Unit, Double[]> conversions)
	{
		//	this.group = group;
		//unitData = new HashMap<UnitGroup, HashMap<Unit, UnitData>>();
		buildDataSet(conversions);
	}

	private void buildDataSet(HashMap<Unit, Double[]> conversions)
	{

		for (Unit unit : conversions.keySet())
		{

			UnitData data = UnitData.updateWithConversionFactors(unit, unit.getGroup(), conversions.get(unit));
			//unitData.put(unit, data);
		}
	}

}
