package bs.commons.dimvars.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.units.MemoryUnit;
import bs.commons.dimvars.units.TimeUnit;
import bs.commons.dimvars.units.VoltageUnit;

public class DimensionedValueClassCodeGenerator
{

	private static String getBeginningOfFile()
	{
		return null;
	}

	public static void generateDimensionValueClass(Unit[] units, String package_name, String source_directory)
	{
		String valueClassFile = getPreClassSection(units, package_name);
		valueClassFile += getClassHeader(units);
		valueClassFile += getConstructor(units);
		valueClassFile += getDynamicConstructor(units);
		for (Unit unit : units)
		{
			valueClassFile += getUnitMethods(unit);
		}
		valueClassFile += "}";
		writeFile(source_directory, package_name, units, valueClassFile);
	}

	private static void writeFile(String source_directory, String package_name, Unit[] units, String content)
	{
		String fileName = units[0].getGroup().getCategory() + ".java";
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
		section += "import bs.commons.dimvars.core.UnitVal;\n";
		section += "import bs.commons.dimvars.core.UnitData.Unit;\n";
		section += "import bs.commons.dimvars.units.TimeUnit;\n";
		section += "import bs.commons.dimvars.core.DynamicValue;\n";
		section += "import " + unitFullClassName + ";\n";
		section += "import " + unitGroupFullClassName + ";\n\n";
		return section;
	}

	public static String getClassHeader(Unit[] units)
	{
		String classHeader = "public class " + units[0].getGroup().getCategory() + " extends UnitVal" + "\n{\n";
		return classHeader;
	}

	public static String getConstructor(Unit[] units)
	{
		TimeUnit rate = units[0].getRate();
		String rateString = "null";
		if (rate != null)
		{
			rateString = "TimeUnit.SECOND";
		}
		String className = units[0].getGroup().getCategory();
		String unitGroupName = units[0].getGroup().getClass().getSimpleName() + "."
		+ ((Enum) units[0].getGroup()).name();
		String constructor = "public " + className + "(Double val,Unit unit)\n{\n";
		constructor += "super(val,unit," + unitGroupName + "," + rateString + ");\n}\n";
		constructor += "protected " + className + "(Double val,Unit unit, TimeUnit rate)\n{\n";
		constructor += "super(val,unit," + unitGroupName + ",rate);\n}\n";
		constructor += "public " + className + "()\n{\n";
		String unitClassName = ((Enum) units[0]).getClass().getSimpleName() + "." + ((Enum) units[0]).name();
		constructor += "super(0.0," + unitClassName + "," + unitGroupName + "," + rateString + ");\n}\n";
		return constructor;
	}

	public static String getDynamicConstructor(Unit[] units)
	{
		TimeUnit rate = units[0].getRate();
		String unitClassName = ((Enum) units[0]).getClass().getSimpleName() + "." + ((Enum) units[0]).name();
		String rateString = "null";
		if (rate != null)
		{
			rateString = "TimeUnit.SECOND";
		}
		String className = units[0].getGroup().getCategory();
		String unitGroupName = units[0].getGroup().getClass().getSimpleName() + "."
		+ ((Enum) units[0].getGroup()).name();
		String constructor = "public static DynamicValue<" + className + "> getDynamic" + className + "Value()\n{\n";
		constructor += className + " valClass = new " + className + "(0.0," + unitClassName + "," + rateString + ");\n";
		constructor += className + " derClass = new " + className + "(0.0," + unitClassName + ", TimeUnit.SECOND);\n";
		constructor += "return new DynamicValue<" + className + ">(valClass,derClass);\n}\n";
		return constructor;
	}

	public static String getUnitMethods(Unit unit)
	{
		String unitClassName = ((Enum) unit).getClass().getSimpleName() + "." + ((Enum) unit).name();
		String unitAbrev = null;
		try
		{
			unitAbrev = UnitData.getUnitData(unit).unitAbbreviation;
		} catch (UnitException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (unitAbrev == "byte")
		{
			unitAbrev = "_byte";
		}
		String getMethod = "public Double " + unitAbrev + "()\n{\n";
		getMethod += "return getValue(" + unitClassName + ",TimeUnit.SECOND);\n}\n";
		getMethod += "public void " + unitAbrev + "(Double val)\n{\n";
		getMethod += "setValue(val," + unitClassName + ",TimeUnit.SECOND);\n}\n";
		//if (unit.getRate() != null)
		{
			getMethod += "public Double " + unitAbrev + "(TimeUnit rate)\n{\n";
			getMethod += "return getValue(" + unitClassName + ",rate);\n}\n";
			getMethod += "public void " + unitAbrev + "(Double val, TimeUnit rate)\n{\n";
			getMethod += "setValue(val," + unitClassName + ",rate);\n}\n";
		}
		return getMethod;
	}

	public static void createAllValueClasses()
	{
		HashMap<String, ArrayList<Object>> units = ClassUtilities.getAllInterfaceEnumValues(Unit.class, "bs.");
		System.out.println("Value classes to write " + units.size());
		for (ArrayList<Object> unitList : units.values())
		{
			System.out.println(unitList.toString());
			Unit[] unitArray = new Unit[unitList.size()];
			for (int objInd = 0; objInd < unitList.size(); objInd++)
			{
				unitArray[objInd] = (Unit) unitList.get(objInd);
			}
			generateDimensionValueClass(unitArray, "bs.commons.dimvars.values", "src/main/java");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Creating");
		//generateDimensionValueClass(VoltageUnit.values(), "bs.commons.dimvars.tvalues", "src/main/java");
		createAllValueClasses();
	}
}
