package bs.commons.dimvars.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import bs.commons.dimvars.core.UnitData;
import bs.commons.dimvars.core.UnitData.Unit;
import bs.commons.dimvars.exceptions.UnitException;
import bs.commons.dimvars.units.DistanceUnit;
import bs.commons.dimvars.units.MemoryUnit;

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
		for (Unit unit : units)
		{
			valueClassFile += getUnitMethods(unit);
		}
		valueClassFile += "}";
		writeFile(source_directory, package_name, units, valueClassFile);
	}

	private static void writeFile(String source_directory, String package_name, Unit[] units, String content)
	{
		String fileName = units[0].getGroup().getCategory() + "Value.java";
		File dir = new File(
		System.getProperty("user.home") + "/" + source_directory + "/" + package_name.replace(".", "/"));
		dir.mkdirs();
		File file = new File(System.getProperty("user.home") + "/" + source_directory + "/"
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
		section += "import bs.commons.dimvars.core.DimensionedValue;\n";
		section += "import bs.commons.dimvars.core.UnitData.Unit;\n";
		section += "import bs.commons.dimvars.core.UnitData.Unit;\n";
		section += "import " + unitFullClassName + ";\n";
		section += "import " + unitGroupFullClassName + ";\n\n";
		return section;
	}

	public static String getClassHeader(Unit[] units)
	{
		String classHeader = "public class " + units[0].getGroup().getCategory() + "Value extends DimensionedValue"
		+ "\n{\n";
		return classHeader;
	}

	public static String getConstructor(Unit[] units)
	{
		String className = units[0].getGroup().getCategory() + "Value";
		String unitGroupName = units[0].getGroup().getClass().getSimpleName() + "."
		+ ((Enum) units[0].getGroup()).name();
		String constructor = "public " + className + "(Unit unit, Double val)\n{\n";
		constructor += "super(val,unit," + unitGroupName + ");\n}\n";
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
		getMethod += "return getValue(" + unitClassName + ");\n}\n";
		getMethod += "public void " + unitAbrev + "(Double val)\n{\n";
		getMethod += "setValue(val," + unitClassName + ");\n}\n";
		return getMethod;
	}

	public static void main(String[] args)
	{
		System.out.print(getPreClassSection(MemoryUnit.values(), "bs.commons.dimvars.core"));
		System.out.print(getClassHeader(MemoryUnit.values()));
		System.out.println(getConstructor(MemoryUnit.values()));
		generateDimensionValueClass(DistanceUnit.values(), "bs.commons.dimvars.values", "Desktop/test/");
	}
}
