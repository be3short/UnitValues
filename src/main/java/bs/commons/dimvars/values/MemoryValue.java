package bs.commons.dimvars.values;

import bs.commons.dimvars.core.DimensionedValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.MemoryUnit;
import bs.commons.dimvars.core.UnitType;

public class MemoryValue extends DimensionedValue
{

	public MemoryValue(Unit unit, Double val)
	{
		super(val, unit, UnitType.MEMORY);
	}

	public Double bit()
	{
		return getValue(MemoryUnit.BIT);
	}

	public void bit(Double val)
	{
		setValue(val, MemoryUnit.BIT);
	}

	public Double _byte()
	{
		return getValue(MemoryUnit.BYTE);
	}

	public void _byte(Double val)
	{
		setValue(val, MemoryUnit.BYTE);
	}

	public Double kB()
	{
		return getValue(MemoryUnit.KILOBYTE);
	}

	public void kB(Double val)
	{
		setValue(val, MemoryUnit.KILOBYTE);
	}

	public Double MB()
	{
		return getValue(MemoryUnit.MEGABYTE);
	}

	public void MB(Double val)
	{
		setValue(val, MemoryUnit.MEGABYTE);
	}

	public Double GB()
	{
		return getValue(MemoryUnit.GIGABYTE);
	}

	public void GB(Double val)
	{
		setValue(val, MemoryUnit.GIGABYTE);
	}

	public Double TB()
	{
		return getValue(MemoryUnit.TERABYTE);
	}

	public void TB(Double val)
	{
		setValue(val, MemoryUnit.TERABYTE);
	}

	public Double PB()
	{
		return getValue(MemoryUnit.PETABYTE);
	}

	public void PB(Double val)
	{
		setValue(val, MemoryUnit.PETABYTE);
	}

	public Double EB()
	{
		return getValue(MemoryUnit.EXABYTE);
	}

	public void EB(Double val)
	{
		setValue(val, MemoryUnit.EXABYTE);
	}

	public Double ZB()
	{
		return getValue(MemoryUnit.ZETTABYTE);
	}

	public void ZB(Double val)
	{
		setValue(val, MemoryUnit.ZETTABYTE);
	}

	public Double YB()
	{
		return getValue(MemoryUnit.YOTTABYTE);
	}

	public void YB(Double val)
	{
		setValue(val, MemoryUnit.YOTTABYTE);
	}
}