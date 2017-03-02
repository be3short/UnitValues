package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitVal;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicValue;
import bs.commons.dimvars.units.MassUnit;
import bs.commons.dimvars.core.UnitType;

public class Mass extends UnitVal
{
public Mass(Double val,Unit unit)
{
super(val,unit,UnitType.MASS,null);
}
protected Mass(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.MASS,rate);
}
public Mass()
{
super(0.0,MassUnit.GRAMS,UnitType.MASS,null);
}
public static DynamicValue<Mass> getDynamicMassValue()
{
Mass valClass = new Mass(0.0,MassUnit.GRAMS,null);
Mass derClass = new Mass(0.0,MassUnit.GRAMS, TimeUnit.SECOND);
return new DynamicValue<Mass>(valClass,derClass);
}
public Double g()
{
return getValue(MassUnit.GRAMS,TimeUnit.SECOND);
}
public void g(Double val)
{
setValue(val,MassUnit.GRAMS,TimeUnit.SECOND);
}
public Double g(TimeUnit rate)
{
return getValue(MassUnit.GRAMS,rate);
}
public void g(Double val, TimeUnit rate)
{
setValue(val,MassUnit.GRAMS,rate);
}
public Double kg()
{
return getValue(MassUnit.KILOGRAMS,TimeUnit.SECOND);
}
public void kg(Double val)
{
setValue(val,MassUnit.KILOGRAMS,TimeUnit.SECOND);
}
public Double kg(TimeUnit rate)
{
return getValue(MassUnit.KILOGRAMS,rate);
}
public void kg(Double val, TimeUnit rate)
{
setValue(val,MassUnit.KILOGRAMS,rate);
}
}