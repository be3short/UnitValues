package bs.commons.dimvars.units;

import bs.commons.dimvars.core.DimensionedValue;
import bs.commons.dimvars.exceptions.UnitException;

public class Test
{

	public static void main(String args[]) throws UnitException
	{
		DimensionedValue length = new DimensionedValue(1.5, DistanceUnit.METERS);
		System.out.println(length.getVal(DistanceUnit.CM));
		System.out.println(length.getVal(DistanceUnit.KM));
	}
}
