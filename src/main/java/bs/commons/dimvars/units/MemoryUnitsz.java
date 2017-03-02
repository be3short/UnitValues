package bs.commons.dimvars.units;


import java.util.ArrayList;
import java.util.TreeMap;

public class MemoryUnitsz
{

	static private ArrayList<MemoryUnitsz> Units = new ArrayList<MemoryUnitsz>();
	static private TreeMap<String, MemoryUnitsz> UnitsByName = new TreeMap<String, MemoryUnitsz>();
	static private int NextOrdinal = 0;

	public static final MemoryUnitsz UNKNOWN = addUnits("Unknown");
	public static final MemoryUnitsz BYTES = addUnits("Bytes");
	public static final MemoryUnitsz KB = addUnits("KB");
	public static final MemoryUnitsz MB = addUnits("MB");
	public static final MemoryUnitsz GB = addUnits("GB");
	public static final MemoryUnitsz TB = addUnits("TB");

	public static final Double MemoryFactor = 1024.0;
	//	public static final Double BytesPerKB = 1024.0;
	//	public static final Double BytesPerMB = 1048576.0;
	//	public static final Double BytesPerGB = 1073741824.0;
	//	public static final Double BytesPerTB = 1099511627776.0;

	private final int ordinal;
	private final transient String name;

	static private final double[][] FACTORS =
	{
			{ 0. }, // from UNKNOWN_SPEED_UNITS to any
			{ // from bytes to:
					0., // UNKNOWN_SPEED_UNITS
					1., // bytes
					1. / MemoryFactor, // kb
					1. / Math.pow(MemoryFactor, 2), // mb
					1 / Math.pow(MemoryFactor, 3), // gb
					1 / Math.pow(MemoryFactor, 4) }, // tb
			{ // from kb to:
					0., // UNKNOWN_SPEED_UNITS
					1. * MemoryFactor, // bytes
					1., // kb
					1. / MemoryFactor, // mb
					1 / Math.pow(MemoryFactor, 2), // gb
					1 / Math.pow(MemoryFactor, 3) }, // tb
			{ // from mb to:
					0., // UNKNOWN_SPEED_UNITS
					1. * Math.pow(MemoryFactor, 2), // bytes
					1. * MemoryFactor, // kb
					1., // mb
					1 / MemoryFactor, // gb
					1 / Math.pow(MemoryFactor, 2) }, // tb
			{ // from gb to:
					0., // UNKNOWN_SPEED_UNITS
					1. * Math.pow(MemoryFactor, 3), // bytes
					1. * Math.pow(MemoryFactor, 2), // kb
					1. * MemoryFactor, // mb
					1, // gb
					1 / MemoryFactor }, // tb
			{ // from tb to:
					0., // UNKNOWN_SPEED_UNITS
					1. * Math.pow(MemoryFactor, 4), // bytes
					1. * Math.pow(MemoryFactor, 3), // kb
					1. * Math.pow(MemoryFactor, 2), // mb
					1 * MemoryFactor, // gb
					1 }, // tb
	};

	public static double convert(double value, MemoryUnitsz unitsFrom, MemoryUnitsz unitsTo)
	{
		// No conversion if units are the same
		if (unitsFrom == unitsTo)
		{
			return value;
		}

		return FACTORS[unitsFrom.ordinal][unitsTo.ordinal] * value;
	}

	private MemoryUnitsz(String name)
	{
		this.ordinal = NextOrdinal;
		this.name = name;
		NextOrdinal++;
	}

	private static MemoryUnitsz addUnits(String name)
	{
		MemoryUnitsz Next = new MemoryUnitsz(name);
		Units.add(Next);
		UnitsByName.put(name, Next);
		return Next;
	}

	public String getName()
	{
		return name;
	}
}
