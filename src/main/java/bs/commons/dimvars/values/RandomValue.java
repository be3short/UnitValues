package bs.commons.dimvars.values;

import bs.commons.dimvars.core.UnitData.Unit;

public class RandomValue
{

	public Double min = 0.0;
	public Double max = 0.0;

	public RandomValue(Double min, Double max)
	{
		this.min = min;
		this.max = max;
	}

	public Double getValue()
	{
		return max * Math.random() + min;
	}
}
