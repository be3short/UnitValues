package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitVal;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicValue;
import bs.commons.dimvars.units.AngleUnit;
import bs.commons.dimvars.core.UnitType;

public class Angle extends UnitVal
{
public Angle(Double val,Unit unit)
{
super(val,unit,UnitType.ANGLE,null);
}
protected Angle(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.ANGLE,rate);
}
public Angle()
{
super(0.0,AngleUnit.RAD,UnitType.ANGLE,null);
}
public static DynamicValue<Angle> getDynamicAngleValue()
{
Angle valClass = new Angle(0.0,AngleUnit.RAD,null);
Angle derClass = new Angle(0.0,AngleUnit.RAD, TimeUnit.SECOND);
return new DynamicValue<Angle>(valClass,derClass);
}
public Double rad()
{
return getValue(AngleUnit.RAD,TimeUnit.SECOND);
}
public void rad(Double val)
{
setValue(val,AngleUnit.RAD,TimeUnit.SECOND);
}
public Double rad(TimeUnit rate)
{
return getValue(AngleUnit.RAD,rate);
}
public void rad(Double val, TimeUnit rate)
{
setValue(val,AngleUnit.RAD,rate);
}
public Double deg()
{
return getValue(AngleUnit.DEG,TimeUnit.SECOND);
}
public void deg(Double val)
{
setValue(val,AngleUnit.DEG,TimeUnit.SECOND);
}
public Double deg(TimeUnit rate)
{
return getValue(AngleUnit.DEG,rate);
}
public void deg(Double val, TimeUnit rate)
{
setValue(val,AngleUnit.DEG,rate);
}
}