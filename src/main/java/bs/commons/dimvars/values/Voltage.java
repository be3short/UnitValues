package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitVal;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicValue;
import bs.commons.dimvars.units.VoltageUnit;
import bs.commons.dimvars.core.UnitType;

public class Voltage extends UnitVal
{
public Voltage(Double val,Unit unit)
{
super(val,unit,UnitType.VOLTAGE,null);
}
protected Voltage(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.VOLTAGE,rate);
}
public Voltage()
{
super(0.0,VoltageUnit.NANOVOLT,UnitType.VOLTAGE,null);
}
public static DynamicValue<Voltage> getDynamicVoltageValue()
{
Voltage valClass = new Voltage(0.0,VoltageUnit.NANOVOLT,null);
Voltage derClass = new Voltage(0.0,VoltageUnit.NANOVOLT, TimeUnit.SECOND);
return new DynamicValue<Voltage>(valClass,derClass);
}
public Double nV()
{
return getValue(VoltageUnit.NANOVOLT,TimeUnit.SECOND);
}
public void nV(Double val)
{
setValue(val,VoltageUnit.NANOVOLT,TimeUnit.SECOND);
}
public Double nV(TimeUnit rate)
{
return getValue(VoltageUnit.NANOVOLT,rate);
}
public void nV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.NANOVOLT,rate);
}
public Double uV()
{
return getValue(VoltageUnit.MICROVOLT,TimeUnit.SECOND);
}
public void uV(Double val)
{
setValue(val,VoltageUnit.MICROVOLT,TimeUnit.SECOND);
}
public Double uV(TimeUnit rate)
{
return getValue(VoltageUnit.MICROVOLT,rate);
}
public void uV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.MICROVOLT,rate);
}
public Double mV()
{
return getValue(VoltageUnit.MILLIVOLT,TimeUnit.SECOND);
}
public void mV(Double val)
{
setValue(val,VoltageUnit.MILLIVOLT,TimeUnit.SECOND);
}
public Double mV(TimeUnit rate)
{
return getValue(VoltageUnit.MILLIVOLT,rate);
}
public void mV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.MILLIVOLT,rate);
}
public Double V()
{
return getValue(VoltageUnit.VOLT,TimeUnit.SECOND);
}
public void V(Double val)
{
setValue(val,VoltageUnit.VOLT,TimeUnit.SECOND);
}
public Double V(TimeUnit rate)
{
return getValue(VoltageUnit.VOLT,rate);
}
public void V(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.VOLT,rate);
}
public Double kV()
{
return getValue(VoltageUnit.KILOVOLT,TimeUnit.SECOND);
}
public void kV(Double val)
{
setValue(val,VoltageUnit.KILOVOLT,TimeUnit.SECOND);
}
public Double kV(TimeUnit rate)
{
return getValue(VoltageUnit.KILOVOLT,rate);
}
public void kV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.KILOVOLT,rate);
}
public Double MV()
{
return getValue(VoltageUnit.MEGAVOLT,TimeUnit.SECOND);
}
public void MV(Double val)
{
setValue(val,VoltageUnit.MEGAVOLT,TimeUnit.SECOND);
}
public Double MV(TimeUnit rate)
{
return getValue(VoltageUnit.MEGAVOLT,rate);
}
public void MV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.MEGAVOLT,rate);
}
public Double GV()
{
return getValue(VoltageUnit.GIGAVOLT,TimeUnit.SECOND);
}
public void GV(Double val)
{
setValue(val,VoltageUnit.GIGAVOLT,TimeUnit.SECOND);
}
public Double GV(TimeUnit rate)
{
return getValue(VoltageUnit.GIGAVOLT,rate);
}
public void GV(Double val, TimeUnit rate)
{
setValue(val,VoltageUnit.GIGAVOLT,rate);
}
}