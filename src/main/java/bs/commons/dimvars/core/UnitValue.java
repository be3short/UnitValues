package bs.commons.dimvars.core;

import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;

/*
 * Unit Val is short for Unit Value, which is a value with an associated unit.  This class allows values to be stored in a specified unit, and then retrieved in any unit of the same type
 */
@SuppressWarnings("unchecked")
public class UnitValue<T> extends AnyObject<T>
{

	private Unit unit; // units of the value
	private Class<T> valueClass;

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
	public UnitValue(T val, Unit unit) throws UnitException
	{
		super(val);
		//System.out.println(val.getClass());
		if (val.getClass().equals(Double.class))
		{
			valueClass = (Class<T>) Double.class;
		}
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
	protected UnitValue(T val, Unit unit, UnitGroup group)
	{
		super(val);
		UnitData data = null;
		if (val.getClass().equals(Double.class))
		{
			valueClass = (Class<T>) Double.class;
		}
		try
		{
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
	public void set(T val, Unit unit) throws UnitException
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
			set(val);
		} catch (Exception e)
		{
			throw new UnitException(
			"Unable to store value: Bad value " + val + " of unit " + newUnitData.getDescription());
		}
	}

	public T get(Unit unit) throws UnitException
	{
		if (unit.equals(this.unit))
		{
			return get();
		}
		UnitData returnUnitData = UnitData.getUnitData(unit);
		T returnVal = null;
		if (this.unit == null)
		{
			throw new UnitException(
			"Unable to get value : Units specified " + returnUnitData.getDescription() + " for dimensionless value");
		} else
		{
			try
			{
				if (get().getClass().equals(Double.class))
				{
					returnVal = (valueClass)
					.cast(Double.class.cast(get()) * UnitData.getUnitData(this.unit).getConversionFactor(unit));
				} else
				{
					returnVal = get();
				}
			} catch (Exception e)
			{
				throw new UnitException("Unable to get value : No conversion to " + returnUnitData.getDescription()
				+ " from " + UnitData.getUnitData(this.unit).getDescription());
			}
		}
		return returnVal;
	}

	protected T getValue(Unit unit)
	{
		T returnVal = null;
		if (unit.equals(this.unit))
		{
			return get();
		}
		try
		{
			if (get().getClass().equals(Double.class))
			{
				//System.out.println(
				//get().toString() + " " + unit.toString() + UnitData.getUnitData(this.unit).getConversionFactor(unit));
				returnVal = (valueClass)
				.cast(((Double) get()) * UnitData.getUnitData(this.unit).getConversionFactor(unit));
				//System.out.println(returnVal);
			} else
			{
				return get();
			}
		} catch (Exception unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
		return returnVal;

	}

	protected void setValue(T val, Unit unit)
	{
		try
		{
			set(val);
			UnitData.getUnitData(unit);
			this.unit = unit;//UnitData.getUnitData(unit);
		} catch (UnitException unitException)
		{
			System.err.println("Improper use of set value");
			unitException.printStackTrace();
			System.exit(1);
		}
	}

	public Unit getUnit()
	{
		return this.unit;
	}

}
