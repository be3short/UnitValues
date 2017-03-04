package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.MemoryUnit;
import bs.commons.dimvars.core.UnitType;

/**
 * Class that stores a value in Memoryunits. This value can be extracted or updated in any units of the same type.
 *
 * @author: Brendan Short
 *
 * @date: 03-02-2017
 */
public class Memory extends UnitValue
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
public Memory(Double val,Unit unit)
{
super(val,unit,UnitType.MEMORY);
}
	/*
	 * gets the value in Bit
	 * 
	 * @returns value in Bit
	 */
public Double bits()
{
return getValue(MemoryUnit.BIT);
}
	/*
	 * stores the value in Bit
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Bit
	 */
public void bits(Double val)
{
setValue(val,MemoryUnit.BIT);
}
	/*
	 * Bit Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newBit(Double new_val)
{
return new Memory(new_val,MemoryUnit.BIT);
}
	/*
	 * gets the value in Byte
	 * 
	 * @returns value in Byte
	 */
public Double Bytes()
{
return getValue(MemoryUnit.BYTE);
}
	/*
	 * stores the value in Byte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Byte
	 */
public void Bytes(Double val)
{
setValue(val,MemoryUnit.BYTE);
}
	/*
	 * Byte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newByte(Double new_val)
{
return new Memory(new_val,MemoryUnit.BYTE);
}
	/*
	 * gets the value in Kilobyte
	 * 
	 * @returns value in Kilobyte
	 */
public Double kilobytes()
{
return getValue(MemoryUnit.KILOBYTE);
}
	/*
	 * stores the value in Kilobyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Kilobyte
	 */
public void kilobytes(Double val)
{
setValue(val,MemoryUnit.KILOBYTE);
}
	/*
	 * Kilobyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newKilobyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.KILOBYTE);
}
	/*
	 * gets the value in Megabyte
	 * 
	 * @returns value in Megabyte
	 */
public Double megabytes()
{
return getValue(MemoryUnit.MEGABYTE);
}
	/*
	 * stores the value in Megabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Megabyte
	 */
public void megabytes(Double val)
{
setValue(val,MemoryUnit.MEGABYTE);
}
	/*
	 * Megabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newMegabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.MEGABYTE);
}
	/*
	 * gets the value in Gigabyte
	 * 
	 * @returns value in Gigabyte
	 */
public Double gigabytes()
{
return getValue(MemoryUnit.GIGABYTE);
}
	/*
	 * stores the value in Gigabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Gigabyte
	 */
public void gigabytes(Double val)
{
setValue(val,MemoryUnit.GIGABYTE);
}
	/*
	 * Gigabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newGigabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.GIGABYTE);
}
	/*
	 * gets the value in Terabyte
	 * 
	 * @returns value in Terabyte
	 */
public Double terabytes()
{
return getValue(MemoryUnit.TERABYTE);
}
	/*
	 * stores the value in Terabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Terabyte
	 */
public void terabytes(Double val)
{
setValue(val,MemoryUnit.TERABYTE);
}
	/*
	 * Terabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newTerabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.TERABYTE);
}
	/*
	 * gets the value in Petabyte
	 * 
	 * @returns value in Petabyte
	 */
public Double petabytes()
{
return getValue(MemoryUnit.PETABYTE);
}
	/*
	 * stores the value in Petabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Petabyte
	 */
public void petabytes(Double val)
{
setValue(val,MemoryUnit.PETABYTE);
}
	/*
	 * Petabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newPetabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.PETABYTE);
}
	/*
	 * gets the value in Exabyte
	 * 
	 * @returns value in Exabyte
	 */
public Double exabytes()
{
return getValue(MemoryUnit.EXABYTE);
}
	/*
	 * stores the value in Exabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Exabyte
	 */
public void exabytes(Double val)
{
setValue(val,MemoryUnit.EXABYTE);
}
	/*
	 * Exabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newExabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.EXABYTE);
}
	/*
	 * gets the value in Zettabyte
	 * 
	 * @returns value in Zettabyte
	 */
public Double zettabytes()
{
return getValue(MemoryUnit.ZETTABYTE);
}
	/*
	 * stores the value in Zettabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Zettabyte
	 */
public void zettabytes(Double val)
{
setValue(val,MemoryUnit.ZETTABYTE);
}
	/*
	 * Zettabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newZettabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.ZETTABYTE);
}
	/*
	 * gets the value in Yottabyte
	 * 
	 * @returns value in Yottabyte
	 */
public Double yottabytes()
{
return getValue(MemoryUnit.YOTTABYTE);
}
	/*
	 * stores the value in Yottabyte
	 * 
	 *@param value to be stored
	 *
	 * @returns value in Yottabyte
	 */
public void yottabytes(Double val)
{
setValue(val,MemoryUnit.YOTTABYTE);
}
	/*
	 * Yottabyte Constructor
	 * 
	 * @param val - value to be stored
	 * 
	 * @returns Memory variable
	 */
public static Memory newYottabyte(Double new_val)
{
return new Memory(new_val,MemoryUnit.YOTTABYTE);
}
}