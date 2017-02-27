package bs.commons.unitvars.variables;

import bs.commons.unitvars.units.SpeedUnit;
import bs.commons.unitvars.units.UnitData.UnitDataSet;

public class SpeedVariable
{

	SpeedUnit unit;
	UnitDataSet<SpeedUnit> unitData = unit.getDataSet();
}
