package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;

/*
 * Unit Val is short for Unit Value, which is a value with an associated unit.  This class allows values to be stored in a specified unit, and then retrieved in any unit of the same type
 */
public class UnitValue
{

	public Unit unit; // units of the value
	public Double value; // value itself

	/*
	 * Public Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly
	 */
	public UnitValue(Double val, Unit unit) throws UnitException
	{
		value = val;
		this.unit = unit;
		UnitData.getUnitData(unit);
	}

	/*
	 * Protected Constructor - this constructor is used to define extensions of
	 * this class, see classes in bs.commons.dimvars.values package for examples
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @param group - unit type group
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly or if the unit does not match the group specified
	 */
	protected UnitValue(Double val, Unit unit, UnitGroup group)
	{
		UnitData data = null;
		try
		{
			value = val;
			this.unit = unit;
			data = UnitData.getUnitData(this.unit);
		} catch (Exception unitException)
		{
			new UnitException("Unable to create " + group.getType() + " value: invalid unit used in constructor")
			.printStackTrace();
			;
			unitException.printStackTrace();
			System.exit(1);
		}
		if (!data.group.equals(group))
		{
			new UnitException("Unable to create " + group.getType() + " value: Wrong unit " + data.getDescription()
			+ " used in constructor").printStackTrace();
			;
			System.exit(1);
		}
	}

	/*
	 * Public setVal - Sets the value in a specified unit
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @param group - unit type group
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly or if the unit does not match the group specified
	 */
	public void setVal(Double val, Unit unit) throws UnitException
	{
		UnitData newUnitData = UnitData.getUnitData(unit);
		this.unit = unit;//newUnitData;
		if (!newUnitData.group.equals(UnitData.getUnitData(this.unit).group))
		{
			throw new UnitException("Unable to store value: Wrong type " + newUnitData.getDescription()
			+ " for a variable of type " + UnitData.getUnitData(this.unit).group.getType());
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
		try
		{
			value = val;
			UnitData.getUnitData(unit);
			this.unit = unit;//UnitData.getUnitData(unit);
		} catch (UnitException unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
	}

}
