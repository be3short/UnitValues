package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.AmperageUnits;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Amperageunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Amperage extends UnitValue<Double>
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
public Amperage(Double val,Unit unit)
{
super(val,unit,UnitType.AMPERAGE);
}
	/*
	 * gets the value in Nanoamp
	 * 
	 * @returns value in Nanoamp
	 */
public Double nanoamps()
{
return getValue(AmperageUnits.NANOAMP);
}
	/*
	 * stores the value in Nanoamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Nanoamp
	 */
public void nanoamps(Double val)
{
setValue(val,AmperageUnits.NANOAMP);
}
	/*
	 * Nanoamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newNanoampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.NANOAMP);
}
	/*
	 * Nanoamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newNanoampValue()
{
return new Amperage(0.0,AmperageUnits.NANOAMP);
}
	/*
	 * gets the value in Microamp
	 * 
	 * @returns value in Microamp
	 */
public Double microamps()
{
return getValue(AmperageUnits.MICROAMP);
}
	/*
	 * stores the value in Microamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Microamp
	 */
public void microamps(Double val)
{
setValue(val,AmperageUnits.MICROAMP);
}
	/*
	 * Microamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newMicroampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.MICROAMP);
}
	/*
	 * Microamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newMicroampValue()
{
return new Amperage(0.0,AmperageUnits.MICROAMP);
}
	/*
	 * gets the value in Milliamp
	 * 
	 * @returns value in Milliamp
	 */
public Double milliamps()
{
return getValue(AmperageUnits.MILLIAMP);
}
	/*
	 * stores the value in Milliamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Milliamp
	 */
public void milliamps(Double val)
{
setValue(val,AmperageUnits.MILLIAMP);
}
	/*
	 * Milliamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newMilliampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.MILLIAMP);
}
	/*
	 * Milliamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newMilliampValue()
{
return new Amperage(0.0,AmperageUnits.MILLIAMP);
}
	/*
	 * gets the value in Amp
	 * 
	 * @returns value in Amp
	 */
public Double amps()
{
return getValue(AmperageUnits.AMP);
}
	/*
	 * stores the value in Amp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Amp
	 */
public void amps(Double val)
{
setValue(val,AmperageUnits.AMP);
}
	/*
	 * Amp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newAmpValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.AMP);
}
	/*
	 * Amp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newAmpValue()
{
return new Amperage(0.0,AmperageUnits.AMP);
}
	/*
	 * gets the value in Kiloamp
	 * 
	 * @returns value in Kiloamp
	 */
public Double kiloamps()
{
return getValue(AmperageUnits.KILO_AMP);
}
	/*
	 * stores the value in Kiloamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kiloamp
	 */
public void kiloamps(Double val)
{
setValue(val,AmperageUnits.KILO_AMP);
}
	/*
	 * Kiloamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newKiloampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.KILO_AMP);
}
	/*
	 * Kiloamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newKiloampValue()
{
return new Amperage(0.0,AmperageUnits.KILO_AMP);
}
	/*
	 * gets the value in Megaamp
	 * 
	 * @returns value in Megaamp
	 */
public Double megaamps()
{
return getValue(AmperageUnits.MEGA_AMP);
}
	/*
	 * stores the value in Megaamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Megaamp
	 */
public void megaamps(Double val)
{
setValue(val,AmperageUnits.MEGA_AMP);
}
	/*
	 * Megaamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newMegaampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.MEGA_AMP);
}
	/*
	 * Megaamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newMegaampValue()
{
return new Amperage(0.0,AmperageUnits.MEGA_AMP);
}
	/*
	 * gets the value in Gigaamp
	 * 
	 * @returns value in Gigaamp
	 */
public Double gigaamps()
{
return getValue(AmperageUnits.GIGA_AMP);
}
	/*
	 * stores the value in Gigaamp
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gigaamp
	 */
public void gigaamps(Double val)
{
setValue(val,AmperageUnits.GIGA_AMP);
}
	/*
	 * Gigaamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Amperage variable
	 */
public static Amperage newGigaampValue(Double new_val)
{
return new Amperage(new_val,AmperageUnits.GIGA_AMP);
}
	/*
	 * Gigaamp Constructor with zero value
* 
	 * @returns Amperage variable
	 */
public static Amperage newGigaampValue()
{
return new Amperage(0.0,AmperageUnits.GIGA_AMP);
}
}