package paper;

import java.util.ArrayList;
import java.util.List;

public abstract class Paper {
	List<PaperUnit> unitList = new ArrayList<PaperUnit>();

	public List<PaperUnit> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<PaperUnit> unitList) {
		this.unitList = unitList;
	}
	
	public abstract void create();
	public abstract void read();
	public abstract void write();
	
}
