package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.EnergyUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Energyunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Energy extends UnitValue<Double>
{
	/*
	 * General Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @param unit - units of the value to be stored
	 * 
	 * @throws UnitException - throws an exception if the unit is not configured
	 * correctly
	 */
public Energy(Double val,Unit unit)
{
super(val,unit,UnitType.ENERGY);
}
	/*
	 * gets the value in Watt Hour
	 * 
	 * @returns value in Watt Hour
	 */
public Double wattHours()
{
return getValue(EnergyUnit.WATT_HOUR);
}
	/*
	 * stores the value in Watt Hour
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Watt Hour
	 */
public void wattHours(Double val)
{
setValue(val,EnergyUnit.WATT_HOUR);
}
	/*
	 * Watt Hour Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Energy variable
	 */
public static Energy newWattHourValue(Double new_val)
{
return new Energy(new_val,EnergyUnit.WATT_HOUR);
}
	/*
	 * Watt Hour Constructor with zero value
* 
	 * @returns Energy variable
	 */
public static Energy newWattHourValue()
{
return new Energy(0.0,EnergyUnit.WATT_HOUR);
}
	/*
	 * gets the value in Miliamp Hour
	 * 
	 * @returns value in Miliamp Hour
	 */
public Double miliampHours()
{
return getValue(EnergyUnit.MILIAMP_HOUR);
}
	/*
	 * stores the value in Miliamp Hour
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Miliamp Hour
	 */
public void miliampHours(Double val)
{
setValue(val,EnergyUnit.MILIAMP_HOUR);
}
	/*
	 * Miliamp Hour Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Energy variable
	 */
public static Energy newMiliampHourValue(Double new_val)
{
return new Energy(new_val,EnergyUnit.MILIAMP_HOUR);
}
	/*
	 * Miliamp Hour Constructor with zero value
* 
	 * @returns Energy variable
	 */
public static Energy newMiliampHourValue()
{
return new Energy(0.0,EnergyUnit.MILIAMP_HOUR);
}
}