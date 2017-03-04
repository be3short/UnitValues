package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.NoUnit;
import bs.commons.dimvars.core.UnitType;

public class NoUnits extends UnitValue
{
public NoUnits(Double val,Unit unit)
{
super(val,unit,UnitType.NONE,null);
}
protected NoUnits(Double val,Unit unit, TimeUnit rate)
{
super(val,unit,UnitType.NONE,rate);
}
public NoUnits()
{
super(0.0,NoUnit.NONE,UnitType.NONE,null);
}
public static DynamicVal<NoUnits> getDynamicNoUnitsValue()
{
NoUnits valClass = new NoUnits(0.0,NoUnit.NONE,null);
NoUnits derClass = new NoUnits(0.0,NoUnit.NONE, TimeUnit.SECOND);
return new DynamicVal<NoUnits>(valClass,derClass);
}
public Double val()
{
return getValue(NoUnit.NONE,TimeUnit.SECOND);
}
public void val(Double val)
{
setValue(val,NoUnit.NONE,TimeUnit.SECOND);
}
public Double val(TimeUnit rate)
{
return getValue(NoUnit.NONE,rate);
}
public void val(Double val, TimeUnit rate)
{
setValue(val,NoUnit.NONE,rate);
}
}