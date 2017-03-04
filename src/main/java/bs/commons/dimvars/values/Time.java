package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Timeunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Time extends UnitValue
{
	/*
	 * General Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly
	 */
public Time(Double val,Unit unit)
{
super(val,unit,UnitType.TIME);
}
	/*
	 * gets the value in Nanosecond
	 * 
	 * @returns value in Nanosecond
	 */
public Double nanoseconds()
{
return getValue(TimeUnit.NANOSECOND);
}
	/*
	 * stores the value in Nanosecond
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanosecond
	 */
public void nanoseconds(Double val)
{
setValue(val,TimeUnit.NANOSECOND);
}
	/*
	 * Nanosecond Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newNanosecond(Double new_val)
{
return new Time(new_val,TimeUnit.NANOSECOND);
}
	/*
	 * gets the value in Microsecond
	 * 
	 * @returns value in Microsecond
	 */
public Double microseconds()
{
return getValue(TimeUnit.MICROSECOND);
}
	/*
	 * stores the value in Microsecond
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Microsecond
	 */
public void microseconds(Double val)
{
setValue(val,TimeUnit.MICROSECOND);
}
	/*
	 * Microsecond Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newMicrosecond(Double new_val)
{
return new Time(new_val,TimeUnit.MICROSECOND);
}
	/*
	 * gets the value in Millisecond
	 * 
	 * @returns value in Millisecond
	 */
public Double milliseconds()
{
return getValue(TimeUnit.MILLISECOND);
}
	/*
	 * stores the value in Millisecond
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Millisecond
	 */
public void milliseconds(Double val)
{
setValue(val,TimeUnit.MILLISECOND);
}
	/*
	 * Millisecond Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newMillisecond(Double new_val)
{
return new Time(new_val,TimeUnit.MILLISECOND);
}
	/*
	 * gets the value in Second
	 * 
	 * @returns value in Second
	 */
public Double seconds()
{
return getValue(TimeUnit.SECOND);
}
	/*
	 * stores the value in Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Second
	 */
public void seconds(Double val)
{
setValue(val,TimeUnit.SECOND);
}
	/*
	 * Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newSecond(Double new_val)
{
return new Time(new_val,TimeUnit.SECOND);
}
	/*
	 * gets the value in Minute
	 * 
	 * @returns value in Minute
	 */
public Double minutes()
{
return getValue(TimeUnit.MINUTE);
}
	/*
	 * stores the value in Minute
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Minute
	 */
public void minutes(Double val)
{
setValue(val,TimeUnit.MINUTE);
}
	/*
	 * Minute Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newMinute(Double new_val)
{
return new Time(new_val,TimeUnit.MINUTE);
}
	/*
	 * gets the value in Hour
	 * 
	 * @returns value in Hour
	 */
public Double hours()
{
return getValue(TimeUnit.HOUR);
}
	/*
	 * stores the value in Hour
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Hour
	 */
public void hours(Double val)
{
setValue(val,TimeUnit.HOUR);
}
	/*
	 * Hour Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Time variable
	 */
public static Time newHour(Double new_val)
{
return new Time(new_val,TimeUnit.HOUR);
}
}