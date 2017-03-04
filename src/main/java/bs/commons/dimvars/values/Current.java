package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.CurrentUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Currentunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Current extends UnitValue
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
public Current(Double val,Unit unit)
{
super(val,unit,UnitType.CURRENT);
}
	/*
	 * gets the value in Nanoamp
	 * 
	 * @returns value in Nanoamp
	 */
public Double nanoamps()
{
return getValue(CurrentUnit.NANOAMP);
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
setValue(val,CurrentUnit.NANOAMP);
}
	/*
	 * Nanoamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newNanoamp(Double new_val)
{
return new Current(new_val,CurrentUnit.NANOAMP);
}
	/*
	 * gets the value in Microamp
	 * 
	 * @returns value in Microamp
	 */
public Double microamps()
{
return getValue(CurrentUnit.MICROAMP);
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
setValue(val,CurrentUnit.MICROAMP);
}
	/*
	 * Microamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newMicroamp(Double new_val)
{
return new Current(new_val,CurrentUnit.MICROAMP);
}
	/*
	 * gets the value in Milliamp
	 * 
	 * @returns value in Milliamp
	 */
public Double milliamps()
{
return getValue(CurrentUnit.MILLIAMP);
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
setValue(val,CurrentUnit.MILLIAMP);
}
	/*
	 * Milliamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newMilliamp(Double new_val)
{
return new Current(new_val,CurrentUnit.MILLIAMP);
}
	/*
	 * gets the value in Amp
	 * 
	 * @returns value in Amp
	 */
public Double amps()
{
return getValue(CurrentUnit.AMP);
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
setValue(val,CurrentUnit.AMP);
}
	/*
	 * Amp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newAmp(Double new_val)
{
return new Current(new_val,CurrentUnit.AMP);
}
	/*
	 * gets the value in Kiloamp
	 * 
	 * @returns value in Kiloamp
	 */
public Double kiloamps()
{
return getValue(CurrentUnit.KILO_AMP);
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
setValue(val,CurrentUnit.KILO_AMP);
}
	/*
	 * Kiloamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newKiloamp(Double new_val)
{
return new Current(new_val,CurrentUnit.KILO_AMP);
}
	/*
	 * gets the value in Megaamp
	 * 
	 * @returns value in Megaamp
	 */
public Double megaamps()
{
return getValue(CurrentUnit.MEGA_AMP);
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
setValue(val,CurrentUnit.MEGA_AMP);
}
	/*
	 * Megaamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newMegaamp(Double new_val)
{
return new Current(new_val,CurrentUnit.MEGA_AMP);
}
	/*
	 * gets the value in Gigaamp
	 * 
	 * @returns value in Gigaamp
	 */
public Double gigaamps()
{
return getValue(CurrentUnit.GIGA_AMP);
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
setValue(val,CurrentUnit.GIGA_AMP);
}
	/*
	 * Gigaamp Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Current variable
	 */
public static Current newGigaamp(Double new_val)
{
return new Current(new_val,CurrentUnit.GIGA_AMP);
}
}