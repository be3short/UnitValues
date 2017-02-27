package bs.commons.unitvars.units;

import bs.commons.unitvars.variables.AnyVar;

public class Testv
{

	public static void main(String args[])
	{
		AnyVar length = new AnyVar(DistanceUnit.METERS, 1.5);
		System.out.println(length.getValue(DistanceUnit.CM));
		System.out.println(length.getValue(DistanceUnit.KM));
	}
}
