package view;

import paper.Paper;

public abstract class UI {
	Paper paper;
	
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public abstract void read();
	public abstract void write();
	public abstract void score();
	
}
