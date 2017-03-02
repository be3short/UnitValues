package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;

public class DimensionedValue
{

	protected UnitData unit;
	private Double value;

	public DimensionedValue(Double val, Unit unit) throws UnitException
	{
		value = val;
		this.unit = UnitData.getUnitData(unit);
	}

	protected DimensionedValue(Double val, Unit unit, UnitGroup group)
	{
		try
		{
			value = val;
			this.unit = UnitData.getUnitData(unit);
		} catch (Exception unitException)
		{
			new UnitException("Unable to create " + group.getCategory() + " value: invalid unit used in constructor")
			.printStackTrace();
			;
			unitException.printStackTrace();
			System.exit(1);
		}
		if (!this.unit.group.equals(group))
		{
			new UnitException("Unable to create " + group.getCategory() + " value: Wrong unit "
			+ this.unit.getDescription() + " used in constructor").printStackTrace();
			;
			System.exit(1);
		}
	}

	public void setVal(Double val, Unit unit) throws UnitException
	{
		UnitData newUnitData = UnitData.getUnitData(unit);
		this.unit = newUnitData;
		if (!newUnitData.group.equals(this.unit.group))
		{
			throw new UnitException("Unable to store value: Wrong type " + newUnitData.getDescription()
			+ " for a variable of type " + this.unit.group.getCategory());
		}
		try
		{
			value = val;
		} catch (Exception e)
		{
			throw new UnitException(
			"Unable to store value: Bad value " + value + " of unit " + newUnitData.getDescription());
		}
	}

	public Double getVal() throws UnitException
	{
		if (unit == null)
		{
			return value;
		} else
		{
			throw new UnitException("Unable to get value : No units specified for dimensioned value");
		}
	}

	public Double getVal(Unit unit) throws UnitException
	{
		UnitData returnUnitData = UnitData.getUnitData(unit);
		if (this.unit == null)
		{
			throw new UnitException(
			"Unable to get value : Units specified " + returnUnitData.getDescription() + " for dimensionless value");
		} else
		{
			try
			{
				return value * this.unit.getConversionFactor(unit);
			} catch (Exception e)
			{
				throw new UnitException("Unable to get value : No conversion to " + returnUnitData.getDescription()
				+ " from " + this.unit.getDescription());
			}
		}
	}

	protected Double getValue(Unit unit)
	{
		Double returnVal = null;
		try
		{
			returnVal = value * this.unit.getConversionFactor(unit);
		} catch (Exception unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
		return returnVal;

	}

	protected void setValue(Double val, Unit unit)
	{
		try
		{
			value = val;
			this.unit = UnitData.getUnitData(unit);
		} catch (UnitException unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
	}

}
