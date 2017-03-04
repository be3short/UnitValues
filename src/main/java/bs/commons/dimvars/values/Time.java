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
public class Time extends UnitValue<Double>
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
public static Time newNanosecondValue(Double new_val)
{
return new Time(new_val,TimeUnit.NANOSECOND);
}
	/*
	 * Nanosecond Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newNanosecondValue()
{
return new Time(0.0,TimeUnit.NANOSECOND);
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
public static Time newMicrosecondValue(Double new_val)
{
return new Time(new_val,TimeUnit.MICROSECOND);
}
	/*
	 * Microsecond Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newMicrosecondValue()
{
return new Time(0.0,TimeUnit.MICROSECOND);
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
public static Time newMillisecondValue(Double new_val)
{
return new Time(new_val,TimeUnit.MILLISECOND);
}
	/*
	 * Millisecond Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newMillisecondValue()
{
return new Time(0.0,TimeUnit.MILLISECOND);
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
public static Time newSecondValue(Double new_val)
{
return new Time(new_val,TimeUnit.SECOND);
}
	/*
	 * Second Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newSecondValue()
{
return new Time(0.0,TimeUnit.SECOND);
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
public static Time newMinuteValue(Double new_val)
{
return new Time(new_val,TimeUnit.MINUTE);
}
	/*
	 * Minute Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newMinuteValue()
{
return new Time(0.0,TimeUnit.MINUTE);
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
public static Time newHourValue(Double new_val)
{
return new Time(new_val,TimeUnit.HOUR);
}
	/*
	 * Hour Constructor with zero value
* 
	 * @returns Time variable
	 */
public static Time newHourValue()
{
return new Time(0.0,TimeUnit.HOUR);
}
}