package bs.commons.unitvars.values;

import bs.commons.unitvars.core.UnitValue;
import bs.commons.unitvars.core.UnitData.Unit;
import bs.commons.unitvars.units.VoltageUnit;
import bs.commons.unitvars.core.UnitType;

/**
 * Class that stores a value in Voltageunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Voltage extends UnitValue<Double>
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
public Voltage(Double val,Unit unit)
{
super(val,unit,UnitType.VOLTAGE);
}
	/*
	 * gets the value in Nanovolt
	 * 
	 * @returns value in Nanovolt
	 */
public Double nanovolts()
{
return getValue(VoltageUnit.NANOVOLT);
}
	/*
	 * stores the value in Nanovolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanovolt
	 */
public void nanovolts(Double val)
{
setValue(val,VoltageUnit.NANOVOLT);
}
	/*
	 * Nanovolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newNanovoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.NANOVOLT);
}
	/*
	 * Nanovolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newNanovoltsValue()
{
return new Voltage(0.0,VoltageUnit.NANOVOLT);
}
	/*
	 * gets the value in Microvolt
	 * 
	 * @returns value in Microvolt
	 */
public Double microvolts()
{
return getValue(VoltageUnit.MICROVOLT);
}
	/*
	 * stores the value in Microvolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Microvolt
	 */
public void microvolts(Double val)
{
setValue(val,VoltageUnit.MICROVOLT);
}
	/*
	 * Microvolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newMicrovoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.MICROVOLT);
}
	/*
	 * Microvolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newMicrovoltsValue()
{
return new Voltage(0.0,VoltageUnit.MICROVOLT);
}
	/*
	 * gets the value in Millivolt
	 * 
	 * @returns value in Millivolt
	 */
public Double millivolts()
{
return getValue(VoltageUnit.MILLIVOLT);
}
	/*
	 * stores the value in Millivolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Millivolt
	 */
public void millivolts(Double val)
{
setValue(val,VoltageUnit.MILLIVOLT);
}
	/*
	 * Millivolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newMillivoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.MILLIVOLT);
}
	/*
	 * Millivolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newMillivoltsValue()
{
return new Voltage(0.0,VoltageUnit.MILLIVOLT);
}
	/*
	 * gets the value in Volt
	 * 
	 * @returns value in Volt
	 */
public Double volts()
{
return getValue(VoltageUnit.VOLT);
}
	/*
	 * stores the value in Volt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Volt
	 */
public void volts(Double val)
{
setValue(val,VoltageUnit.VOLT);
}
	/*
	 * Volt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newVoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.VOLT);
}
	/*
	 * Volt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newVoltsValue()
{
return new Voltage(0.0,VoltageUnit.VOLT);
}
	/*
	 * gets the value in Kilovolt
	 * 
	 * @returns value in Kilovolt
	 */
public Double kilovolts()
{
return getValue(VoltageUnit.KILOVOLT);
}
	/*
	 * stores the value in Kilovolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilovolt
	 */
public void kilovolts(Double val)
{
setValue(val,VoltageUnit.KILOVOLT);
}
	/*
	 * Kilovolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newKilovoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.KILOVOLT);
}
	/*
	 * Kilovolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newKilovoltsValue()
{
return new Voltage(0.0,VoltageUnit.KILOVOLT);
}
	/*
	 * gets the value in Megavolt
	 * 
	 * @returns value in Megavolt
	 */
public Double megavolts()
{
return getValue(VoltageUnit.MEGAVOLT);
}
	/*
	 * stores the value in Megavolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Megavolt
	 */
public void megavolts(Double val)
{
setValue(val,VoltageUnit.MEGAVOLT);
}
	/*
	 * Megavolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newMegavoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.MEGAVOLT);
}
	/*
	 * Megavolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newMegavoltsValue()
{
return new Voltage(0.0,VoltageUnit.MEGAVOLT);
}
	/*
	 * gets the value in Gigavolt
	 * 
	 * @returns value in Gigavolt
	 */
public Double gigavolts()
{
return getValue(VoltageUnit.GIGAVOLT);
}
	/*
	 * stores the value in Gigavolt
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gigavolt
	 */
public void gigavolts(Double val)
{
setValue(val,VoltageUnit.GIGAVOLT);
}
	/*
	 * Gigavolt Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Voltage variable
	 */
public static Voltage newGigavoltsValue(Double new_val)
{
return new Voltage(new_val,VoltageUnit.GIGAVOLT);
}
	/*
	 * Gigavolt Constructor with zero value
* 
	 * @returns Voltage variable
	 */
public static Voltage newGigavoltsValue()
{
return new Voltage(0.0,VoltageUnit.GIGAVOLT);
}
}