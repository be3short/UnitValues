package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.MemoryUnit;
import bs.commons.dimvars.core.UnitType;

public class Memory extends UnitValue
{
public Memory(Double val,Unit unit)
{
super(val,unit,UnitType.MEMORY,null);
}
protected Memory(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.MEMORY,rate);
}
public Memory()
{
super(0.0,MemoryUnit.BIT,UnitType.MEMORY,null);
}
public static DynamicVal<Memory> getDynamicMemoryValue()
{
Memory valClass = new Memory(0.0,MemoryUnit.BIT,null);
Memory derClass = new Memory(0.0,MemoryUnit.BIT, TimeUnit.SECOND);
return new DynamicVal<Memory>(valClass,derClass);
}
public Double bit()
{
return getValue(MemoryUnit.BIT,TimeUnit.SECOND);
}
public void bit(Double val)
{
setValue(val,MemoryUnit.BIT,TimeUnit.SECOND);
}
public Double bit(TimeUnit rate)
{
return getValue(MemoryUnit.BIT,rate);
}
public void bit(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.BIT,rate);
}
public Double _byte()
{
return getValue(MemoryUnit.BYTE,TimeUnit.SECOND);
}
public void _byte(Double val)
{
setValue(val,MemoryUnit.BYTE,TimeUnit.SECOND);
}
public Double _byte(TimeUnit rate)
{
return getValue(MemoryUnit.BYTE,rate);
}
public void _byte(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.BYTE,rate);
}
public Double kB()
{
return getValue(MemoryUnit.KILOBYTE,TimeUnit.SECOND);
}
public void kB(Double val)
{
setValue(val,MemoryUnit.KILOBYTE,TimeUnit.SECOND);
}
public Double kB(TimeUnit rate)
{
return getValue(MemoryUnit.KILOBYTE,rate);
}
public void kB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.KILOBYTE,rate);
}
public Double MB()
{
return getValue(MemoryUnit.MEGABYTE,TimeUnit.SECOND);
}
public void MB(Double val)
{
setValue(val,MemoryUnit.MEGABYTE,TimeUnit.SECOND);
}
public Double MB(TimeUnit rate)
{
return getValue(MemoryUnit.MEGABYTE,rate);
}
public void MB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.MEGABYTE,rate);
}
public Double GB()
{
return getValue(MemoryUnit.GIGABYTE,TimeUnit.SECOND);
}
public void GB(Double val)
{
setValue(val,MemoryUnit.GIGABYTE,TimeUnit.SECOND);
}
public Double GB(TimeUnit rate)
{
return getValue(MemoryUnit.GIGABYTE,rate);
}
public void GB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.GIGABYTE,rate);
}
public Double TB()
{
return getValue(MemoryUnit.TERABYTE,TimeUnit.SECOND);
}
public void TB(Double val)
{
setValue(val,MemoryUnit.TERABYTE,TimeUnit.SECOND);
}
public Double TB(TimeUnit rate)
{
return getValue(MemoryUnit.TERABYTE,rate);
}
public void TB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.TERABYTE,rate);
}
public Double PB()
{
return getValue(MemoryUnit.PETABYTE,TimeUnit.SECOND);
}
public void PB(Double val)
{
setValue(val,MemoryUnit.PETABYTE,TimeUnit.SECOND);
}
public Double PB(TimeUnit rate)
{
return getValue(MemoryUnit.PETABYTE,rate);
}
public void PB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.PETABYTE,rate);
}
public Double EB()
{
return getValue(MemoryUnit.EXABYTE,TimeUnit.SECOND);
}
public void EB(Double val)
{
setValue(val,MemoryUnit.EXABYTE,TimeUnit.SECOND);
}
public Double EB(TimeUnit rate)
{
return getValue(MemoryUnit.EXABYTE,rate);
}
public void EB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.EXABYTE,rate);
}
public Double ZB()
{
return getValue(MemoryUnit.ZETTABYTE,TimeUnit.SECOND);
}
public void ZB(Double val)
{
setValue(val,MemoryUnit.ZETTABYTE,TimeUnit.SECOND);
}
public Double ZB(TimeUnit rate)
{
return getValue(MemoryUnit.ZETTABYTE,rate);
}
public void ZB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.ZETTABYTE,rate);
}
public Double YB()
{
return getValue(MemoryUnit.YOTTABYTE,TimeUnit.SECOND);
}
public void YB(Double val)
{
setValue(val,MemoryUnit.YOTTABYTE,TimeUnit.SECOND);
}
public Double YB(TimeUnit rate)
{
return getValue(MemoryUnit.YOTTABYTE,rate);
}
public void YB(Double val, TimeUnit rate)
{
setValue(val,MemoryUnit.YOTTABYTE,rate);
}
}