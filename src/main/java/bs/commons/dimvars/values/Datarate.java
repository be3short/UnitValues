package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.DataRateUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Datarateunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Datarate extends UnitValue
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
public Datarate(Double val,Unit unit)
{
super(val,unit,UnitType.DATA_RATE);
}
	/*
	 * gets the value in Bits per Second
	 * 
	 * @returns value in Bits per Second
	 */
public Double bitsPerSeconds()
{
return getValue(DataRateUnit.BITS_PER_SEC);
}
	/*
	 * stores the value in Bits per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Bits per Second
	 */
public void bitsPerSeconds(Double val)
{
setValue(val,DataRateUnit.BITS_PER_SEC);
}
	/*
	 * Bits per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newBitsPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.BITS_PER_SEC);
}
	/*
	 * gets the value in Bytes per Second
	 * 
	 * @returns value in Bytes per Second
	 */
public Double bytesPerSeconds()
{
return getValue(DataRateUnit.BYTES_PER_SEC);
}
	/*
	 * stores the value in Bytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Bytes per Second
	 */
public void bytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.BYTES_PER_SEC);
}
	/*
	 * Bytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newBytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.BYTES_PER_SEC);
}
	/*
	 * gets the value in Kilobytes per Second
	 * 
	 * @returns value in Kilobytes per Second
	 */
public Double kilobytesPerSeconds()
{
return getValue(DataRateUnit.KILOBYTES_PER_SEC);
}
	/*
	 * stores the value in Kilobytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilobytes per Second
	 */
public void kilobytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.KILOBYTES_PER_SEC);
}
	/*
	 * Kilobytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newKilobytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.KILOBYTES_PER_SEC);
}
	/*
	 * gets the value in Megabytes per Second
	 * 
	 * @returns value in Megabytes per Second
	 */
public Double megabytesPerSeconds()
{
return getValue(DataRateUnit.MEGABYTES_PER_SEC);
}
	/*
	 * stores the value in Megabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Megabytes per Second
	 */
public void megabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.MEGABYTES_PER_SEC);
}
	/*
	 * Megabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newMegabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.MEGABYTES_PER_SEC);
}
	/*
	 * gets the value in Gigabytes per Second
	 * 
	 * @returns value in Gigabytes per Second
	 */
public Double gigabytesPerSeconds()
{
return getValue(DataRateUnit.GIGABYTES_PER_SEC);
}
	/*
	 * stores the value in Gigabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gigabytes per Second
	 */
public void gigabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.GIGABYTES_PER_SEC);
}
	/*
	 * Gigabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newGigabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.GIGABYTES_PER_SEC);
}
	/*
	 * gets the value in Terabytes per Second
	 * 
	 * @returns value in Terabytes per Second
	 */
public Double terabytesPerSeconds()
{
return getValue(DataRateUnit.TERABYTES_PER_SEC);
}
	/*
	 * stores the value in Terabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Terabytes per Second
	 */
public void terabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.TERABYTES_PER_SEC);
}
	/*
	 * Terabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newTerabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.TERABYTES_PER_SEC);
}
	/*
	 * gets the value in Petabytes per Second
	 * 
	 * @returns value in Petabytes per Second
	 */
public Double petabytesPerSeconds()
{
return getValue(DataRateUnit.PETABYTES_PER_SEC);
}
	/*
	 * stores the value in Petabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Petabytes per Second
	 */
public void petabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.PETABYTES_PER_SEC);
}
	/*
	 * Petabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newPetabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.PETABYTES_PER_SEC);
}
	/*
	 * gets the value in Exabytes per Second
	 * 
	 * @returns value in Exabytes per Second
	 */
public Double exabytesPerSeconds()
{
return getValue(DataRateUnit.EXABYTES_PER_SEC);
}
	/*
	 * stores the value in Exabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Exabytes per Second
	 */
public void exabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.EXABYTES_PER_SEC);
}
	/*
	 * Exabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newExabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.EXABYTES_PER_SEC);
}
	/*
	 * gets the value in Zettabytes per Second
	 * 
	 * @returns value in Zettabytes per Second
	 */
public Double zettabytesPerSeconds()
{
return getValue(DataRateUnit.ZETTABYTES_PER_SEC);
}
	/*
	 * stores the value in Zettabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Zettabytes per Second
	 */
public void zettabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.ZETTABYTES_PER_SEC);
}
	/*
	 * Zettabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newZettabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.ZETTABYTES_PER_SEC);
}
	/*
	 * gets the value in Yottabytes per Second
	 * 
	 * @returns value in Yottabytes per Second
	 */
public Double yottabytesPerSeconds()
{
return getValue(DataRateUnit.YOTTABYTES_PER_SEC);
}
	/*
	 * stores the value in Yottabytes per Second
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Yottabytes per Second
	 */
public void yottabytesPerSeconds(Double val)
{
setValue(val,DataRateUnit.YOTTABYTES_PER_SEC);
}
	/*
	 * Yottabytes per Second Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Datarate variable
	 */
public static Datarate newYottabytesPerSecond(Double new_val)
{
return new Datarate(new_val,DataRateUnit.YOTTABYTES_PER_SEC);
}
}