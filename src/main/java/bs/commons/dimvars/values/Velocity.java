package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitVal;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicValue;
import bs.commons.dimvars.units.VelocityUnit;
import bs.commons.dimvars.core.UnitType;

public class Velocity extends UnitVal
{
public Velocity(Double val,Unit unit)
{
super(val,unit,UnitType.VELOCITY,TimeUnit.SECOND);
}
protected Velocity(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.VELOCITY,rate);
}
public Velocity()
{
super(0.0,VelocityUnit.NANOMETERS,UnitType.VELOCITY,TimeUnit.SECOND);
}
public static DynamicValue<Velocity> getDynamicVelocityValue()
{
Velocity valClass = new Velocity(0.0,VelocityUnit.NANOMETERS,TimeUnit.SECOND);
Velocity derClass = new Velocity(0.0,VelocityUnit.NANOMETERS, TimeUnit.SECOND);
return new DynamicValue<Velocity>(valClass,derClass);
}
public Double nm()
{
return getValue(VelocityUnit.NANOMETERS,TimeUnit.SECOND);
}
public void nm(Double val)
{
setValue(val,VelocityUnit.NANOMETERS,TimeUnit.SECOND);
}
public Double nm(TimeUnit rate)
{
return getValue(VelocityUnit.NANOMETERS,rate);
}
public void nm(Double val, TimeUnit rate)
{
setValue(val,VelocityUnit.NANOMETERS,rate);
}
public Double um()
{
return getValue(VelocityUnit.MICROMETERS,TimeUnit.SECOND);
}
public void um(Double val)
{
setValue(val,VelocityUnit.MICROMETERS,TimeUnit.SECOND);
}
public Double um(TimeUnit rate)
{
return getValue(VelocityUnit.MICROMETERS,rate);
}
public void um(Double val, TimeUnit rate)
{
setValue(val,VelocityUnit.MICROMETERS,rate);
}
public Double mm()
{
return getValue(VelocityUnit.MILLIMETERS,TimeUnit.SECOND);
}
public void mm(Double val)
{
setValue(val,VelocityUnit.MILLIMETERS,TimeUnit.SECOND);
}
public Double mm(TimeUnit rate)
{
return getValue(VelocityUnit.MILLIMETERS,rate);
}
public void mm(Double val, TimeUnit rate)
{
setValue(val,VelocityUnit.MILLIMETERS,rate);
}
public Double m()
{
return getValue(VelocityUnit.METERS,TimeUnit.SECOND);
}
public void m(Double val)
{
setValue(val,VelocityUnit.METERS,TimeUnit.SECOND);
}
public Double m(TimeUnit rate)
{
return getValue(VelocityUnit.METERS,rate);
}
public void m(Double val, TimeUnit rate)
{
setValue(val,VelocityUnit.METERS,rate);
}
public Double km()
{
return getValue(VelocityUnit.KILOMETERS,TimeUnit.SECOND);
}
public void km(Double val)
{
setValue(val,VelocityUnit.KILOMETERS,TimeUnit.SECOND);
}
public Double km(TimeUnit rate)
{
return getValue(VelocityUnit.KILOMETERS,rate);
}
public void km(Double val, TimeUnit rate)
{
setValue(val,VelocityUnit.KILOMETERS,rate);
}
}