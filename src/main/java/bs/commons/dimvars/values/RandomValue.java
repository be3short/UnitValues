package bs.commons.dimvars.values;

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
