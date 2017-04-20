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
public class Datarate extends UnitValue<Double>
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
public Double bitsPerSecond()
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
public void bitsPerSecond(Double val)
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
public static Datarate newBitsPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.BITS_PER_SEC);
}
	/*
	 * Bits per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newBitsPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.BITS_PER_SEC);
}
	/*
	 * gets the value in Bytes per Second
	 * 
	 * @returns value in Bytes per Second
	 */
public Double bytesPerSecond()
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
public void bytesPerSecond(Double val)
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
public static Datarate newBytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.BYTES_PER_SEC);
}
	/*
	 * Bytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newBytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.BYTES_PER_SEC);
}
	/*
	 * gets the value in Kilobytes per Second
	 * 
	 * @returns value in Kilobytes per Second
	 */
public Double kilobytesPerSecond()
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
public void kilobytesPerSecond(Double val)
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
public static Datarate newKilobytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.KILOBYTES_PER_SEC);
}
	/*
	 * Kilobytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newKilobytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.KILOBYTES_PER_SEC);
}
	/*
	 * gets the value in Megabytes per Second
	 * 
	 * @returns value in Megabytes per Second
	 */
public Double megabytesPerSecond()
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
public void megabytesPerSecond(Double val)
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
public static Datarate newMegabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.MEGABYTES_PER_SEC);
}
	/*
	 * Megabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newMegabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.MEGABYTES_PER_SEC);
}
	/*
	 * gets the value in Gigabytes per Second
	 * 
	 * @returns value in Gigabytes per Second
	 */
public Double gigabytesPerSecond()
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
public void gigabytesPerSecond(Double val)
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
public static Datarate newGigabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.GIGABYTES_PER_SEC);
}
	/*
	 * Gigabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newGigabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.GIGABYTES_PER_SEC);
}
	/*
	 * gets the value in Terabytes per Second
	 * 
	 * @returns value in Terabytes per Second
	 */
public Double terabytesPerSecond()
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
public void terabytesPerSecond(Double val)
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
public static Datarate newTerabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.TERABYTES_PER_SEC);
}
	/*
	 * Terabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newTerabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.TERABYTES_PER_SEC);
}
	/*
	 * gets the value in Petabytes per Second
	 * 
	 * @returns value in Petabytes per Second
	 */
public Double petabytesPerSecond()
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
public void petabytesPerSecond(Double val)
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
public static Datarate newPetabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.PETABYTES_PER_SEC);
}
	/*
	 * Petabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newPetabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.PETABYTES_PER_SEC);
}
	/*
	 * gets the value in Exabytes per Second
	 * 
	 * @returns value in Exabytes per Second
	 */
public Double exabytesPerSecond()
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
public void exabytesPerSecond(Double val)
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
public static Datarate newExabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.EXABYTES_PER_SEC);
}
	/*
	 * Exabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newExabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.EXABYTES_PER_SEC);
}
	/*
	 * gets the value in Zettabytes per Second
	 * 
	 * @returns value in Zettabytes per Second
	 */
public Double zettabytesPerSecond()
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
public void zettabytesPerSecond(Double val)
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
public static Datarate newZettabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.ZETTABYTES_PER_SEC);
}
	/*
	 * Zettabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newZettabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.ZETTABYTES_PER_SEC);
}
	/*
	 * gets the value in Yottabytes per Second
	 * 
	 * @returns value in Yottabytes per Second
	 */
public Double yottabytesPerSecond()
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
public void yottabytesPerSecond(Double val)
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
public static Datarate newYottabytesPerSeconValue(Double new_val)
{
return new Datarate(new_val,DataRateUnit.YOTTABYTES_PER_SEC);
}
	/*
	 * Yottabytes per Second Constructor with zero value
* 
	 * @returns Datarate variable
	 */
public static Datarate newYottabytesPerSeconValue()
{
return new Datarate(0.0,DataRateUnit.YOTTABYTES_PER_SEC);
}
}