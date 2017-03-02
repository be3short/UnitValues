package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitVal;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicValue;
import bs.commons.dimvars.units.DataRate;
import bs.commons.dimvars.core.UnitType;

public class Datarate extends UnitVal
{
public Datarate(Double val,Unit unit)
{
super(val,unit,UnitType.DATA_RATE,TimeUnit.SECOND);
}
protected Datarate(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.DATA_RATE,rate);
}
public Datarate()
{
super(0.0,DataRate.BIT,UnitType.DATA_RATE,TimeUnit.SECOND);
}
public static DynamicValue<Datarate> getDynamicDatarateValue()
{
Datarate valClass = new Datarate(0.0,DataRate.BIT,TimeUnit.SECOND);
Datarate derClass = new Datarate(0.0,DataRate.BIT, TimeUnit.SECOND);
return new DynamicValue<Datarate>(valClass,derClass);
}
public Double bit()
{
return getValue(DataRate.BIT,TimeUnit.SECOND);
}
public void bit(Double val)
{
setValue(val,DataRate.BIT,TimeUnit.SECOND);
}
public Double bit(TimeUnit rate)
{
return getValue(DataRate.BIT,rate);
}
public void bit(Double val, TimeUnit rate)
{
setValue(val,DataRate.BIT,rate);
}
public Double _byte()
{
return getValue(DataRate.BYTE,TimeUnit.SECOND);
}
public void _byte(Double val)
{
setValue(val,DataRate.BYTE,TimeUnit.SECOND);
}
public Double _byte(TimeUnit rate)
{
return getValue(DataRate.BYTE,rate);
}
public void _byte(Double val, TimeUnit rate)
{
setValue(val,DataRate.BYTE,rate);
}
public Double kB()
{
return getValue(DataRate.KILOBYTE,TimeUnit.SECOND);
}
public void kB(Double val)
{
setValue(val,DataRate.KILOBYTE,TimeUnit.SECOND);
}
public Double kB(TimeUnit rate)
{
return getValue(DataRate.KILOBYTE,rate);
}
public void kB(Double val, TimeUnit rate)
{
setValue(val,DataRate.KILOBYTE,rate);
}
public Double MB()
{
return getValue(DataRate.MEGABYTE,TimeUnit.SECOND);
}
public void MB(Double val)
{
setValue(val,DataRate.MEGABYTE,TimeUnit.SECOND);
}
public Double MB(TimeUnit rate)
{
return getValue(DataRate.MEGABYTE,rate);
}
public void MB(Double val, TimeUnit rate)
{
setValue(val,DataRate.MEGABYTE,rate);
}
public Double GB()
{
return getValue(DataRate.GIGABYTE,TimeUnit.SECOND);
}
public void GB(Double val)
{
setValue(val,DataRate.GIGABYTE,TimeUnit.SECOND);
}
public Double GB(TimeUnit rate)
{
return getValue(DataRate.GIGABYTE,rate);
}
public void GB(Double val, TimeUnit rate)
{
setValue(val,DataRate.GIGABYTE,rate);
}
public Double TB()
{
return getValue(DataRate.TERABYTE,TimeUnit.SECOND);
}
public void TB(Double val)
{
setValue(val,DataRate.TERABYTE,TimeUnit.SECOND);
}
public Double TB(TimeUnit rate)
{
return getValue(DataRate.TERABYTE,rate);
}
public void TB(Double val, TimeUnit rate)
{
setValue(val,DataRate.TERABYTE,rate);
}
public Double PB()
{
return getValue(DataRate.PETABYTE,TimeUnit.SECOND);
}
public void PB(Double val)
{
setValue(val,DataRate.PETABYTE,TimeUnit.SECOND);
}
public Double PB(TimeUnit rate)
{
return getValue(DataRate.PETABYTE,rate);
}
public void PB(Double val, TimeUnit rate)
{
setValue(val,DataRate.PETABYTE,rate);
}
public Double EB()
{
return getValue(DataRate.EXABYTE,TimeUnit.SECOND);
}
public void EB(Double val)
{
setValue(val,DataRate.EXABYTE,TimeUnit.SECOND);
}
public Double EB(TimeUnit rate)
{
return getValue(DataRate.EXABYTE,rate);
}
public void EB(Double val, TimeUnit rate)
{
setValue(val,DataRate.EXABYTE,rate);
}
public Double ZB()
{
return getValue(DataRate.ZETTABYTE,TimeUnit.SECOND);
}
public void ZB(Double val)
{
setValue(val,DataRate.ZETTABYTE,TimeUnit.SECOND);
}
public Double ZB(TimeUnit rate)
{
return getValue(DataRate.ZETTABYTE,rate);
}
public void ZB(Double val, TimeUnit rate)
{
setValue(val,DataRate.ZETTABYTE,rate);
}
public Double YB()
{
return getValue(DataRate.YOTTABYTE,TimeUnit.SECOND);
}
public void YB(Double val)
{
setValue(val,DataRate.YOTTABYTE,TimeUnit.SECOND);
}
public Double YB(TimeUnit rate)
{
return getValue(DataRate.YOTTABYTE,rate);
}
public void YB(Double val, TimeUnit rate)
{
setValue(val,DataRate.YOTTABYTE,rate);
}
}