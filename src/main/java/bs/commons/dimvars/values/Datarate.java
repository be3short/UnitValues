package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.units.DatarateUnit;
import bs.commons.dimvars.core.UnitType;

public class Datarate extends UnitValue
{

	public Datarate(Double val, Unit unit)
	{
		super(val, unit, UnitType.DATA_RATE, TimeUnit.SECOND);
	}

	public Datarate(Double val, Unit unit, TimeUnit rate)
	{
		super(val, unit, UnitType.DATA_RATE, rate);
	}

	public Datarate()
	{
		super(0.0, DatarateUnit.BIT, UnitType.DATA_RATE, TimeUnit.SECOND);
	}

	public static DynamicVal<Datarate> getDynamicDatarateValue()
	{
		Datarate valClass = new Datarate(0.0, DatarateUnit.BIT, TimeUnit.SECOND);
		Datarate derClass = new Datarate(0.0, DatarateUnit.BIT, TimeUnit.SECOND);
		return new DynamicVal<Datarate>(valClass, derClass);
	}

	public Double bit()
	{
		return getValue(DatarateUnit.BIT, TimeUnit.SECOND);
	}

	public void bit(Double val)
	{
		setValue(val, DatarateUnit.BIT, TimeUnit.SECOND);
	}

	public Double bit(TimeUnit rate)
	{
		return getValue(DatarateUnit.BIT, rate);
	}

	public void bit(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.BIT, rate);
	}

	public Double _byte()
	{
		return getValue(DatarateUnit.BYTE, TimeUnit.SECOND);
	}

	public void _byte(Double val)
	{
		setValue(val, DatarateUnit.BYTE, TimeUnit.SECOND);
	}

	public Double _byte(TimeUnit rate)
	{
		return getValue(DatarateUnit.BYTE, rate);
	}

	public void _byte(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.BYTE, rate);
	}

	public Double kB()
	{
		return getValue(DatarateUnit.KILOBYTE, TimeUnit.SECOND);
	}

	public void kB(Double val)
	{
		setValue(val, DatarateUnit.KILOBYTE, TimeUnit.SECOND);
	}

	public Double kB(TimeUnit rate)
	{
		return getValue(DatarateUnit.KILOBYTE, rate);
	}

	public void kB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.KILOBYTE, rate);
	}

	public Double MB()
	{
		return getValue(DatarateUnit.MEGABYTE, TimeUnit.SECOND);
	}

	public void MB(Double val)
	{
		setValue(val, DatarateUnit.MEGABYTE, TimeUnit.SECOND);
	}

	public Double MB(TimeUnit rate)
	{
		return getValue(DatarateUnit.MEGABYTE, rate);
	}

	public void MB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.MEGABYTE, rate);
	}

	public Double GB()
	{
		return getValue(DatarateUnit.GIGABYTE, TimeUnit.SECOND);
	}

	public void GB(Double val)
	{
		setValue(val, DatarateUnit.GIGABYTE, TimeUnit.SECOND);
	}

	public Double GB(TimeUnit rate)
	{
		return getValue(DatarateUnit.GIGABYTE, rate);
	}

	public void GB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.GIGABYTE, rate);
	}

	public Double TB()
	{
		return getValue(DatarateUnit.TERABYTE, TimeUnit.SECOND);
	}

	public void TB(Double val)
	{
		setValue(val, DatarateUnit.TERABYTE, TimeUnit.SECOND);
	}

	public Double TB(TimeUnit rate)
	{
		return getValue(DatarateUnit.TERABYTE, rate);
	}

	public void TB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.TERABYTE, rate);
	}

	public Double PB()
	{
		return getValue(DatarateUnit.PETABYTE, TimeUnit.SECOND);
	}

	public void PB(Double val)
	{
		setValue(val, DatarateUnit.PETABYTE, TimeUnit.SECOND);
	}

	public Double PB(TimeUnit rate)
	{
		return getValue(DatarateUnit.PETABYTE, rate);
	}

	public void PB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.PETABYTE, rate);
	}

	public Double EB()
	{
		return getValue(DatarateUnit.EXABYTE, TimeUnit.SECOND);
	}

	public void EB(Double val)
	{
		setValue(val, DatarateUnit.EXABYTE, TimeUnit.SECOND);
	}

	public Double EB(TimeUnit rate)
	{
		return getValue(DatarateUnit.EXABYTE, rate);
	}

	public void EB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.EXABYTE, rate);
	}

	public Double ZB()
	{
		return getValue(DatarateUnit.ZETTABYTE, TimeUnit.SECOND);
	}

	public void ZB(Double val)
	{
		setValue(val, DatarateUnit.ZETTABYTE, TimeUnit.SECOND);
	}

	public Double ZB(TimeUnit rate)
	{
		return getValue(DatarateUnit.ZETTABYTE, rate);
	}

	public void ZB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.ZETTABYTE, rate);
	}

	public Double YB()
	{
		return getValue(DatarateUnit.YOTTABYTE, TimeUnit.SECOND);
	}

	public void YB(Double val)
	{
		setValue(val, DatarateUnit.YOTTABYTE, TimeUnit.SECOND);
	}

	public Double YB(TimeUnit rate)
	{
		return getValue(DatarateUnit.YOTTABYTE, rate);
	}

	public void YB(Double val, TimeUnit rate)
	{
		setValue(val, DatarateUnit.YOTTABYTE, rate);
	}
}