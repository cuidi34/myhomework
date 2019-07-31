package dao;

import paper.PaperUnit;

public interface PaperUnitDAO {
	public abstract PaperUnit add(String content);
	public abstract void save(String content, PaperUnit unit);
}
