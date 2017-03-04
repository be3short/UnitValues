package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.UnitType;

public class Time extends UnitValue
{
public Time(Double val,Unit unit)
{
super(val,unit,UnitType.TIME,null);
}
protected Time(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.TIME,rate);
}
public Time()
{
super(0.0,TimeUnit.NANOSECOND,UnitType.TIME,null);
}
public static DynamicVal<Time> getDynamicTimeValue()
{
Time valClass = new Time(0.0,TimeUnit.NANOSECOND,null);
Time derClass = new Time(0.0,TimeUnit.NANOSECOND, TimeUnit.SECOND);
return new DynamicVal<Time>(valClass,derClass);
}
public Double nS()
{
return getValue(TimeUnit.NANOSECOND,TimeUnit.SECOND);
}
public void nS(Double val)
{
setValue(val,TimeUnit.NANOSECOND,TimeUnit.SECOND);
}
public Double nS(TimeUnit rate)
{
return getValue(TimeUnit.NANOSECOND,rate);
}
public void nS(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.NANOSECOND,rate);
}
public Double us()
{
return getValue(TimeUnit.MICROSECOND,TimeUnit.SECOND);
}
public void us(Double val)
{
setValue(val,TimeUnit.MICROSECOND,TimeUnit.SECOND);
}
public Double us(TimeUnit rate)
{
return getValue(TimeUnit.MICROSECOND,rate);
}
public void us(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.MICROSECOND,rate);
}
public Double ms()
{
return getValue(TimeUnit.MILLISECOND,TimeUnit.SECOND);
}
public void ms(Double val)
{
setValue(val,TimeUnit.MILLISECOND,TimeUnit.SECOND);
}
public Double ms(TimeUnit rate)
{
return getValue(TimeUnit.MILLISECOND,rate);
}
public void ms(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.MILLISECOND,rate);
}
public Double s()
{
return getValue(TimeUnit.SECOND,TimeUnit.SECOND);
}
public void s(Double val)
{
setValue(val,TimeUnit.SECOND,TimeUnit.SECOND);
}
public Double s(TimeUnit rate)
{
return getValue(TimeUnit.SECOND,rate);
}
public void s(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.SECOND,rate);
}
public Double min()
{
return getValue(TimeUnit.MINUTE,TimeUnit.SECOND);
}
public void min(Double val)
{
setValue(val,TimeUnit.MINUTE,TimeUnit.SECOND);
}
public Double min(TimeUnit rate)
{
return getValue(TimeUnit.MINUTE,rate);
}
public void min(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.MINUTE,rate);
}
public Double hr()
{
return getValue(TimeUnit.HOUR,TimeUnit.SECOND);
}
public void hr(Double val)
{
setValue(val,TimeUnit.HOUR,TimeUnit.SECOND);
}
public Double hr(TimeUnit rate)
{
return getValue(TimeUnit.HOUR,rate);
}
public void hr(Double val, TimeUnit rate)
{
setValue(val,TimeUnit.HOUR,rate);
}
}