package bs.commons.unitvars.utils;
import bs.commons.unitvars.units.MemoryUnits;
import bs.commons.unitvars.variables.MemoryVariable;

public class UnitReferences
{

	public static double gb(MemoryVariable memory_variable)
	{
		return memory_variable.getValue(MemoryUnits.GB);
	}

	public static double mb(MemoryVariable memory_variable)
	{
		return memory_variable.getValue(MemoryUnits.MB);
	}

	public static double kb(MemoryVariable memory_variable)
	{
		return memory_variable.getValue(MemoryUnits.KB);
	}

	public static double bytes(MemoryVariable memory_variable)
	{
		return memory_variable.getValue(MemoryUnits.BYTES);
	}

	public static MemoryVariable gb(double memory)
	{
		return new MemoryVariable(memory, MemoryUnits.GB);
	}

	public static MemoryVariable mb(double memory)
	{
		return new MemoryVariable(memory, MemoryUnits.MB);
	}

	public static MemoryVariable kb(double memory)
	{
		return new MemoryVariable(memory, MemoryUnits.KB);
	}

	public static MemoryVariable bytes(double memory)
	{
		return new MemoryVariable(memory, MemoryUnits.BYTES);
	}

	//
	//	public static boolean leq(AnyVariable one, AnyVariable two)
	//	{
	//		return compare(one.getValue(), two.getValue(), "leq");
	//	}
	//
	//
	//
	//	public static boolean less(AnyVariable one, AnyVariable two)
	//	{
	//		return compare(one.getValue(), two.getValue(), "less");
	//	}
	//
	//
	//
	//	public static boolean less(AnyVariable one, Double two)
	//	{
	//		return compare(one.getValue(), two, "less");
	//	}
	//
	//
	//
	//	public static boolean greater(AnyVariable one, AnyVariable two)
	//	{
	//		return compare(one.getValue(), two.getValue(), "less");
	//	}
	//
	//
	//
	//	public static boolean greater(AnyVariable one, Double two)
	//	{
	//		return compare(one.getValue(), two, "greater");
	//	}

	public static enum Compare
	{
		LESS_THAN(
			"<"),
		LEQ(
			"<="),
		GREATER_THAN(
			">"),
		GEQ(
			">=");

		private String operator;

		private Compare(String new_string)
		{
			setOperator(new_string);
		}

		public String getOperator()
		{
			return operator;
		}

		public void setOperator(String operator)
		{
			this.operator = operator;
		}
	}

	private static boolean compare(Double first, Compare compare_type, Double second)
	{

		switch (compare_type)
		{
		case LESS_THAN:
			if (first < second)
			{
				return true;
			} else
			{
				return false;
			}

		case LEQ:
			if (first <= second)
			{
				return true;
			} else
			{
				return false;
			}
		case GREATER_THAN:
			if (first > second)
			{
				return true;
			} else
			{
				return false;
			}

		case GEQ:
			if (first >= second)
			{
				return true;
			} else
			{
				return false;
			}
		default:
			throw new UnsupportedOperationException();
		}

	}

}
