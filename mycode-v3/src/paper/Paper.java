package paper;

import java.util.ArrayList;
import java.util.List;

public class Paper {
	List<PaperUnit> unitList = new ArrayList<PaperUnit>();

	public List<PaperUnit> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<PaperUnit> unitList) {
		this.unitList = unitList;
	}
	
}
