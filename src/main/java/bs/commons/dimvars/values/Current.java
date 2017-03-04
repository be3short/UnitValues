package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.CurrentUnit;
import bs.commons.dimvars.core.UnitType;

public class Current extends UnitValue
{
public Current(Double val,Unit unit)
{
super(val,unit,UnitType.CURRENT,null);
}
protected Current(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.CURRENT,rate);
}
public Current()
{
super(0.0,CurrentUnit.NANOAMP,UnitType.CURRENT,null);
}
public static DynamicVal<Current> getDynamicCurrentValue()
{
Current valClass = new Current(0.0,CurrentUnit.NANOAMP,null);
Current derClass = new Current(0.0,CurrentUnit.NANOAMP, TimeUnit.SECOND);
return new DynamicVal<Current>(valClass,derClass);
}
public Double nA()
{
return getValue(CurrentUnit.NANOAMP,TimeUnit.SECOND);
}
public void nA(Double val)
{
setValue(val,CurrentUnit.NANOAMP,TimeUnit.SECOND);
}
public Double nA(TimeUnit rate)
{
return getValue(CurrentUnit.NANOAMP,rate);
}
public void nA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.NANOAMP,rate);
}
public Double uA()
{
return getValue(CurrentUnit.MICROAMP,TimeUnit.SECOND);
}
public void uA(Double val)
{
setValue(val,CurrentUnit.MICROAMP,TimeUnit.SECOND);
}
public Double uA(TimeUnit rate)
{
return getValue(CurrentUnit.MICROAMP,rate);
}
public void uA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.MICROAMP,rate);
}
public Double mA()
{
return getValue(CurrentUnit.MILLIAMP,TimeUnit.SECOND);
}
public void mA(Double val)
{
setValue(val,CurrentUnit.MILLIAMP,TimeUnit.SECOND);
}
public Double mA(TimeUnit rate)
{
return getValue(CurrentUnit.MILLIAMP,rate);
}
public void mA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.MILLIAMP,rate);
}
public Double A()
{
return getValue(CurrentUnit.AMP,TimeUnit.SECOND);
}
public void A(Double val)
{
setValue(val,CurrentUnit.AMP,TimeUnit.SECOND);
}
public Double A(TimeUnit rate)
{
return getValue(CurrentUnit.AMP,rate);
}
public void A(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.AMP,rate);
}
public Double kA()
{
return getValue(CurrentUnit.KILO_AMP,TimeUnit.SECOND);
}
public void kA(Double val)
{
setValue(val,CurrentUnit.KILO_AMP,TimeUnit.SECOND);
}
public Double kA(TimeUnit rate)
{
return getValue(CurrentUnit.KILO_AMP,rate);
}
public void kA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.KILO_AMP,rate);
}
public Double MA()
{
return getValue(CurrentUnit.MEGA_AMP,TimeUnit.SECOND);
}
public void MA(Double val)
{
setValue(val,CurrentUnit.MEGA_AMP,TimeUnit.SECOND);
}
public Double MA(TimeUnit rate)
{
return getValue(CurrentUnit.MEGA_AMP,rate);
}
public void MA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.MEGA_AMP,rate);
}
public Double GA()
{
return getValue(CurrentUnit.GIGA_AMP,TimeUnit.SECOND);
}
public void GA(Double val)
{
setValue(val,CurrentUnit.GIGA_AMP,TimeUnit.SECOND);
}
public Double GA(TimeUnit rate)
{
return getValue(CurrentUnit.GIGA_AMP,rate);
}
public void GA(Double val, TimeUnit rate)
{
setValue(val,CurrentUnit.GIGA_AMP,rate);
}
}