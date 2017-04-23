package bs.commons.unitvars.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

import bs.commons.objects.utilities.ClassUtilities;
import bs.commons.unitvars.core.UnitData;
import bs.commons.unitvars.core.UnitData.Unit;
import bs.commons.unitvars.exceptions.UnitException;

public class DimensionedValueClassCodeGenerator
{

	public static void generateDimensionValueClass(Unit[] units, String package_name, String source_directory)
	{
		String valueClassFile = getPreClassSection(units, package_name);
		valueClassFile += getClassHeader(units);
		valueClassFile += getConstructor(units);
		for (Unit unit : units)
		{
			valueClassFile += getUnitMethods(unit);
		}
		valueClassFile += "}";
		writeFile(source_directory, package_name, units, valueClassFile);
	}

	private static void writeFile(String source_directory, String package_name, Unit[] units, String content)
	{
		String fileName = units[0].getGroup().getType() + ".java";
		File dir = new File(
		System.getProperty("user.dir") + "/" + source_directory + "/" + package_name.replace(".", "/"));
		dir.mkdirs();
		File file = new File(System.getProperty("user.dir") + "/" + source_directory + "/"
		+ package_name.replace(".", "/") + "/" + fileName);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"))) // create
		{
			writer.write(content);
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public static String getPreClassSection(Unit[] units, String package_name)
	{
		String unitGroupFullClassName = units[0].getGroup().getClass().getName();
		String unitFullClassName = units[0].getClass().getName();
		String section = "package " + package_name + ";\n\n";
		section += "import bs.commons.unitvars.core.UnitValue;\n";
		section += "import bs.commons.unitvars.core.UnitData.Unit;\n";
		//section += "import bs.commons.dimvars.units.TimeUnit;\n";
		//section += "import bs.commons.dimvars.core.DynamicValue;\n";
		section += "import " + unitFullClassName + ";\n";
		section += "import " + unitGroupFullClassName + ";\n\n";
		return section;
	}

	public static String getClassHeader(Unit[] units)
	{
		String unitTypeName = units[0].getGroup().getType();
		String classHeader = "/**\n * Class that stores a value in " + unitTypeName
		+ "units. This value can be extracted or updated in any units of the same type.\n *\n * @author: Brendan Short\n *\n * @date: 03-02-2017\n */\n";
		classHeader += "public class " + units[0].getGroup().getType() + " extends UnitValue<Double>" + "\n{\n";
		return classHeader;
	}

	@SuppressWarnings("rawtypes")
	public static String getConstructor(Unit[] units)
	{
		String className = units[0].getGroup().getType();
		String unitGroupName = units[0].getGroup().getClass().getSimpleName() + "."
		+ ((Enum) units[0].getGroup()).name();
		String constructor = getConstructorComment();
		constructor += "public " + className + "(Double val,Unit unit)\n{\n";
		constructor += "super(val,unit," + unitGroupName + ");\n}\n";
		//constructor += "protected " + className + "(Double val,Unit unit)\n{\n";
		//constructor += "super(val,unit," + unitGroupName + ",rate);\n}\n";
		//constructor += "public " + className + "()\n{\n";
		//String unitClassName = ((Enum) units[0]).getClass().getSimpleName() + "." + ((Enum) units[0]).name();
		//constructor += "super(0.0," + unitClassName + "," + unitGroupName + "," + rateString + ");\n}\n";
		return constructor;
	}

	public static String getConstructorComment()
	{
		return "	/*\n	 * General Constructor\n	 * \n	 * @param val - value to be stored\n	 * \n	 * @param unit - units of the value to be stored\n	 * \n	 * @throws UnitException - throws an exception if the unit is not configured\n	 * correctly\n	 */\n";
	}

	//	public static String getDynamicConstructor(Unit[] units)
	//	{
	//
	//		String unitClassName = ((Enum) units[0]).getClass().getSimpleName() + "." + ((Enum) units[0]).name();
	//		String className = units[0].getGroup().getCategory();
	//		String unitGroupName = units[0].getGroup().getClass().getSimpleName() + "."
	//		+ ((Enum) units[0].getGroup()).name();
	//		String constructor = "public static DynamicValue<" + className + "> getDynamic" + className + "Value()\n{\n";
	//		constructor += className + " valClass = new " + className + "(0.0," + unitClassName + "," + rateString + ");\n";
	//		constructor += className + " derClass = new " + className + "(0.0," + unitClassName + ", TimeUnit.SECOND);\n";
	//		constructor += "return new DynamicValue<" + className + ">(valClass,derClass);\n}\n";
	//		return constructor;
	//	}

	@SuppressWarnings("rawtypes")
	public static String getUnitMethods(Unit unit)
	{
		String unitClassName = ((Enum) unit).getClass().getSimpleName() + "." + ((Enum) unit).name();
		String unitAbrev = null;
		String className = unit.getGroup().getType();
		String unitName = null;
		try
		{
			unitAbrev = getCorrectedMethodName(UnitData.getUnitData(unit).unitName);
			unitName = UnitData.getUnitData(unit).unitName;
		} catch (UnitException e)
		{
			System.err.println("Invalid unit definition : " + unitClassName);
			e.printStackTrace();
		}

		String capitalizedUnitAbrev = unitAbrev.substring(0, 1).toUpperCase() + unitAbrev.substring(1);
		String getMethod = "	/*\n	 * gets the value in " + unitName + "\n	 * \n	 * @returns value in "
		+ unitName + "\n	 */\n";
		getMethod += "public Double " + unitAbrev + "()\n{\n";
		getMethod += "return getValue(" + unitClassName + ");\n}\n";
		getMethod += "	/*\n	 * stores the value in " + unitName
		+ "\n	 * \n	 *@param value to be stored\n	 *\n	 * @returns value in " + unitName + "\n	 */\n";
		getMethod += "public void " + unitAbrev + "(Double val)\n{\n";
		getMethod += "setValue(val," + unitClassName + ");\n}\n";
		getMethod += "	/*\n	 * " + unitName
		+ " Constructor\n	 * \n	 * @param val - value to be stored\n	 * \n	 * @returns " + className
		+ " variable\n	 */\n";
		getMethod += "public static " + className + " new" + capitalizedUnitAbrev + "Value(Double new_val)\n{\n";
		getMethod += "return new " + className + "(new_val," + unitClassName + ");\n}\n";
		getMethod += "	/*\n	 * " + unitName + " Constructor with zero value\n* \n	 * @returns " + className
		+ " variable\n	 */\n";
		getMethod += "public static " + className + " new" + capitalizedUnitAbrev + "Value()\n{\n";
		getMethod += "return new " + className + "(0.0," + unitClassName + ");\n}\n";
		//if (unit.getRate() != null)
		//{
		//getMethod += "public Double " + unitAbrev + "(TimeUnit rate)\n{\n";
		//getMethod += "return getValue(" + unitClassName + ",rate);\n}\n";
		//getMethod += "public void " + unitAbrev + "(Double val, TimeUnit rate)\n{\n";
		//getMethod += "setValue(val," + unitClassName + ",rate);\n}\n";
		//	}
		return getMethod;
	}

	public static String getCorrectedMethodName(String old_name)
	{
		String newName = old_name;
		newName.toLowerCase();
		newName.replace("Second", "Sec");
		String[] sections = newName.split(" ");
		newName = sections[0].toLowerCase();
		for (int i = 1; i < sections.length; i++)
		{
			newName += sections[i].substring(0, 1).toUpperCase() + sections[i].substring(1);
		}
		if (newName.equals("byte"))
		{
			newName = "Byte";
		}
		newName = correctForImproperPlural(newName);
		return newName;
	}

	public static String correctForImproperPlural(String attempt)
	{
		String correctedAttempt = attempt;
		if (correctedAttempt.contains("PerSecond") && !correctedAttempt.contains("Value"))
		{
			correctedAttempt.replace("PerSeconds", "PerSecond");
		} else
		{
			correctedAttempt = correctedAttempt + "s";
		}
		return correctedAttempt;
	}

	public static void createAllValueClasses()
	{
		HashMap<String, ArrayList<Object>> units = ClassUtilities.getAllInterfaceEnumValues(Unit.class,
		"bs.commons.unitvars.units");
		units.remove("NoUnit");
		System.out.println("Value classes to write " + units.size());
		for (ArrayList<Object> unitList : units.values())
		{
			System.out.println(unitList.toString());
			Unit[] unitArray = new Unit[unitList.size()];
			for (int objInd = 0; objInd < unitList.size(); objInd++)
			{
				unitArray[objInd] = (Unit) unitList.get(objInd);
			}
			generateDimensionValueClass(unitArray, "bs.commons.unitvars.values", "src/main/java");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Creating");
		//generateDimensionValueClass(VoltageUnit.values(), "bs.commons.dimvars.tvalues", "src/main/java");
		createAllValueClasses();
	}
}
