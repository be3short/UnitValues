package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.units.TimeUnit;

/*
 * Unit Val is short for Unit Value, which is a value with an associated unit.  This class allows values to be stored in a specified unit, and then retrieved in any unit of the same type
 */
public class UnitVal
{

	public Unit unit;
	private TimeUnit rate;
	public Double value;

	public UnitVal(Double val, Unit unit) throws UnitException
	{
		value = val;
		this.rate = null;
		this.unit = unit;//UnitData.getUnitData(unit);
	}

	public UnitVal(Double val, Unit unit, TimeUnit rate) throws UnitException
	{
		value = val;
		this.rate = rate;
		this.unit = unit;//UnitData.getUnitData(unit);
	}

	protected UnitVal(Double val, Unit unit, UnitGroup group, TimeUnit rate)
	{
		UnitData data = null;
		try
		{
			value = val;
			this.rate = rate;
			this.unit = unit;//
			data = UnitData.getUnitData(this.unit);
		} catch (Exception unitException)
		{
			new UnitException("Unable to create " + group.getCategory() + " value: invalid unit used in constructor")
			.printStackTrace();
			;
			unitException.printStackTrace();
			System.exit(1);
		}
		if (!data.group.equals(group))
		{
			new UnitException("Unable to create " + group.getCategory() + " value: Wrong unit " + data.getDescription()
			+ " used in constructor").printStackTrace();
			;
			System.exit(1);
		}
	}

	public void setVal(Double val, Unit unit) throws UnitException
	{
		UnitData newUnitData = UnitData.getUnitData(unit);
		this.unit = unit;//newUnitData;
		if (!newUnitData.group.equals(UnitData.getUnitData(this.unit).group))
		{
			throw new UnitException("Unable to store value: Wrong type " + newUnitData.getDescription()
			+ " for a variable of type " + UnitData.getUnitData(this.unit).group.getCategory());
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
				return value * UnitData.getUnitData(this.unit).getConversionFactor(unit);
			} catch (Exception e)
			{
				throw new UnitException("Unable to get value : No conversion to " + returnUnitData.getDescription()
				+ " from " + UnitData.getUnitData(this.unit).getDescription());
			}
		}
	}

	protected Double getValue(Unit unit, TimeUnit rate)
	{
		Double returnVal = null;
		try
		{
			returnVal = value * UnitData.getUnitData(this.unit).getConversionFactor(unit);
			if (this.rate != null)
			{
				returnVal = returnVal * UnitData.getUnitData(this.rate).getConversionFactor(rate);
			}
		} catch (Exception unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
		return returnVal;

	}

	protected Double getValue(Unit unit)
	{
		Double returnVal = null;
		try
		{
			returnVal = value * UnitData.getUnitData(this.unit).getConversionFactor(unit);
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
		setValue(val, unit, null);
	}

	protected void setValue(Double val, Unit unit, TimeUnit rate)
	{
		try
		{
			value = val;
			UnitData.getUnitData(unit);
			this.unit = unit;//UnitData.getUnitData(unit);
			if (this.rate != null)
			{
				this.rate = rate;
			}
		} catch (UnitException unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
	}

}
