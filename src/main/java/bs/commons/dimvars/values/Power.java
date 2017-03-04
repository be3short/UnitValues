package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.PowerUnit;
import bs.commons.dimvars.core.UnitType;

public class Power extends UnitValue
{
public Power(Double val,Unit unit)
{
super(val,unit,UnitType.POWER,null);
}
protected Power(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.POWER,rate);
}
public Power()
{
super(0.0,PowerUnit.NANOWATT,UnitType.POWER,null);
}
public static DynamicVal<Power> getDynamicPowerValue()
{
Power valClass = new Power(0.0,PowerUnit.NANOWATT,null);
Power derClass = new Power(0.0,PowerUnit.NANOWATT, TimeUnit.SECOND);
return new DynamicVal<Power>(valClass,derClass);
}
public Double nW()
{
return getValue(PowerUnit.NANOWATT,TimeUnit.SECOND);
}
public void nW(Double val)
{
setValue(val,PowerUnit.NANOWATT,TimeUnit.SECOND);
}
public Double nW(TimeUnit rate)
{
return getValue(PowerUnit.NANOWATT,rate);
}
public void nW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.NANOWATT,rate);
}
public Double uW()
{
return getValue(PowerUnit.MICROWATT,TimeUnit.SECOND);
}
public void uW(Double val)
{
setValue(val,PowerUnit.MICROWATT,TimeUnit.SECOND);
}
public Double uW(TimeUnit rate)
{
return getValue(PowerUnit.MICROWATT,rate);
}
public void uW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.MICROWATT,rate);
}
public Double mW()
{
return getValue(PowerUnit.MILLIWATT,TimeUnit.SECOND);
}
public void mW(Double val)
{
setValue(val,PowerUnit.MILLIWATT,TimeUnit.SECOND);
}
public Double mW(TimeUnit rate)
{
return getValue(PowerUnit.MILLIWATT,rate);
}
public void mW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.MILLIWATT,rate);
}
public Double W()
{
return getValue(PowerUnit.WATT,TimeUnit.SECOND);
}
public void W(Double val)
{
setValue(val,PowerUnit.WATT,TimeUnit.SECOND);
}
public Double W(TimeUnit rate)
{
return getValue(PowerUnit.WATT,rate);
}
public void W(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.WATT,rate);
}
public Double kW()
{
return getValue(PowerUnit.KILOWATT,TimeUnit.SECOND);
}
public void kW(Double val)
{
setValue(val,PowerUnit.KILOWATT,TimeUnit.SECOND);
}
public Double kW(TimeUnit rate)
{
return getValue(PowerUnit.KILOWATT,rate);
}
public void kW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.KILOWATT,rate);
}
public Double MW()
{
return getValue(PowerUnit.MEGAWATT,TimeUnit.SECOND);
}
public void MW(Double val)
{
setValue(val,PowerUnit.MEGAWATT,TimeUnit.SECOND);
}
public Double MW(TimeUnit rate)
{
return getValue(PowerUnit.MEGAWATT,rate);
}
public void MW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.MEGAWATT,rate);
}
public Double GW()
{
return getValue(PowerUnit.GIGAWATT,TimeUnit.SECOND);
}
public void GW(Double val)
{
setValue(val,PowerUnit.GIGAWATT,TimeUnit.SECOND);
}
public Double GW(TimeUnit rate)
{
return getValue(PowerUnit.GIGAWATT,rate);
}
public void GW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.GIGAWATT,rate);
}
public Double TW()
{
return getValue(PowerUnit.TERAWATT,TimeUnit.SECOND);
}
public void TW(Double val)
{
setValue(val,PowerUnit.TERAWATT,TimeUnit.SECOND);
}
public Double TW(TimeUnit rate)
{
return getValue(PowerUnit.TERAWATT,rate);
}
public void TW(Double val, TimeUnit rate)
{
setValue(val,PowerUnit.TERAWATT,rate);
}
}