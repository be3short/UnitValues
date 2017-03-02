package bs.commons.dimvars.values;

import bs.commons.dimvars.core.DimensionedValue;
import bs.commons.dimvars.core.UnitData.Unit;

import bs.commons.dimvars.core.UnitType;
import bs.commons.dimvars.units.DistanceUnit;

public class DistanceValue extends DimensionedValue
{

	public DistanceValue(Unit unit, Double val)
	{
		super(val, unit, UnitType.DISTANCE);
	}

	public Double m()
	{
		return getValue(DistanceUnit.METERS);
	}

	public Double cm()
	{
		return getValue(DistanceUnit.CM);
	}

	public Double km()
	{
		return getValue(DistanceUnit.KM);
	}

	public void m(Double val)
	{
		setValue(val, DistanceUnit.METERS);
	}

	public void cm(Double val)
	{
		setValue(val, DistanceUnit.CM);
	}

}
