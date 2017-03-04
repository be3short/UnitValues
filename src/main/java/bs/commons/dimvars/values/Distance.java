package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.core.UnitType;

public class Distance extends UnitValue
{
public Distance(Double val,Unit unit)
{
super(val,unit,UnitType.DISTANCE,null);
}
protected Distance(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.DISTANCE,rate);
}
public Distance()
{
super(0.0,DistanceUnit.NANOMETERS,UnitType.DISTANCE,null);
}
public static DynamicVal<Distance> getDynamicDistanceValue()
{
Distance valClass = new Distance(0.0,DistanceUnit.NANOMETERS,null);
Distance derClass = new Distance(0.0,DistanceUnit.NANOMETERS, TimeUnit.SECOND);
return new DynamicVal<Distance>(valClass,derClass);
}
public Double nm()
{
return getValue(DistanceUnit.NANOMETERS,TimeUnit.SECOND);
}
public void nm(Double val)
{
setValue(val,DistanceUnit.NANOMETERS,TimeUnit.SECOND);
}
public Double nm(TimeUnit rate)
{
return getValue(DistanceUnit.NANOMETERS,rate);
}
public void nm(Double val, TimeUnit rate)
{
setValue(val,DistanceUnit.NANOMETERS,rate);
}
public Double um()
{
return getValue(DistanceUnit.MICROMETERS,TimeUnit.SECOND);
}
public void um(Double val)
{
setValue(val,DistanceUnit.MICROMETERS,TimeUnit.SECOND);
}
public Double um(TimeUnit rate)
{
return getValue(DistanceUnit.MICROMETERS,rate);
}
public void um(Double val, TimeUnit rate)
{
setValue(val,DistanceUnit.MICROMETERS,rate);
}
public Double mm()
{
return getValue(DistanceUnit.MILLIMETERS,TimeUnit.SECOND);
}
public void mm(Double val)
{
setValue(val,DistanceUnit.MILLIMETERS,TimeUnit.SECOND);
}
public Double mm(TimeUnit rate)
{
return getValue(DistanceUnit.MILLIMETERS,rate);
}
public void mm(Double val, TimeUnit rate)
{
setValue(val,DistanceUnit.MILLIMETERS,rate);
}
public Double m()
{
return getValue(DistanceUnit.METERS,TimeUnit.SECOND);
}
public void m(Double val)
{
setValue(val,DistanceUnit.METERS,TimeUnit.SECOND);
}
public Double m(TimeUnit rate)
{
return getValue(DistanceUnit.METERS,rate);
}
public void m(Double val, TimeUnit rate)
{
setValue(val,DistanceUnit.METERS,rate);
}
public Double km()
{
return getValue(DistanceUnit.KILOMETERS,TimeUnit.SECOND);
}
public void km(Double val)
{
setValue(val,DistanceUnit.KILOMETERS,TimeUnit.SECOND);
}
public Double km(TimeUnit rate)
{
return getValue(DistanceUnit.KILOMETERS,rate);
}
public void km(Double val, TimeUnit rate)
{
setValue(val,DistanceUnit.KILOMETERS,rate);
}
}