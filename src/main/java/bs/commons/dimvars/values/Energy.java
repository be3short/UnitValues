package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.EnergyUnit;
import bs.commons.dimvars.core.UnitType;

public class Energy extends UnitValue
{
public Energy(Double val,Unit unit)
{
super(val,unit,UnitType.ENERGY,TimeUnit.SECOND);
}
protected Energy(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.ENERGY,rate);
}
public Energy()
{
super(0.0,EnergyUnit.WATT_HOUR,UnitType.ENERGY,TimeUnit.SECOND);
}
public static DynamicVal<Energy> getDynamicEnergyValue()
{
Energy valClass = new Energy(0.0,EnergyUnit.WATT_HOUR,TimeUnit.SECOND);
Energy derClass = new Energy(0.0,EnergyUnit.WATT_HOUR, TimeUnit.SECOND);
return new DynamicVal<Energy>(valClass,derClass);
}
public Double wH()
{
return getValue(EnergyUnit.WATT_HOUR,TimeUnit.SECOND);
}
public void wH(Double val)
{
setValue(val,EnergyUnit.WATT_HOUR,TimeUnit.SECOND);
}
public Double wH(TimeUnit rate)
{
return getValue(EnergyUnit.WATT_HOUR,rate);
}
public void wH(Double val, TimeUnit rate)
{
setValue(val,EnergyUnit.WATT_HOUR,rate);
}
public Double mAh()
{
return getValue(EnergyUnit.MILIAMP_HOUR,TimeUnit.SECOND);
}
public void mAh(Double val)
{
setValue(val,EnergyUnit.MILIAMP_HOUR,TimeUnit.SECOND);
}
public Double mAh(TimeUnit rate)
{
return getValue(EnergyUnit.MILIAMP_HOUR,rate);
}
public void mAh(Double val, TimeUnit rate)
{
setValue(val,EnergyUnit.MILIAMP_HOUR,rate);
}
}