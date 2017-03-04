package bs.commons.dimvars.units;

import bs.commons.dimvars.core.DynamicVal;
import bs.commons.dimvars.core.UnitValue;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.values.Distance;

public class Test
{

	public static void main(String args[]) throws UnitException
	{
		UnitValue length = new UnitValue(1.5, DistanceUnit.METERS);
		System.out.println(length.getVal(DistanceUnit.MILLIMETERS));
		System.out.println(length.getVal(DistanceUnit.KILOMETERS));
		Distance d = null;
		try
		{
			d = Distance.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d.value);
	}
}
