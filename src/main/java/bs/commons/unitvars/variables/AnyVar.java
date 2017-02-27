package bs.commons.unitvars.variables;

import bs.commons.objects.manipulation.XMLParser;
import bs.commons.unitvars.units.AnyUnit;
import bs.commons.unitvars.units.UnitData;
import bs.commons.unitvars.units.UnitGroupDefinitions.Unit;

public class AnyVar
{

	private Unit baseUnit;
	private UnitData data;
	private Double value;

	public AnyVar(Unit base, Double val)
	{
		baseUnit = base;
		value = val;
		data = UnitData.getUnitData(base);
	}

	public Double getValue(Unit output)
	{
		Double factor = data.getConversionFactor(output);
		System.out.println(data.toString());
		System.out.println(factor);
		return factor * value;
	}
}
