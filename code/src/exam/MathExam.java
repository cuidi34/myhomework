package exam;

import dao.MapDAO;
import dao.MultiDAO;
import dao.OneDAO;
import dao.TextDAO;
import paper.Paper;
import paper.PaperUnit;

public class MathExam extends Paper {
	
	@Override
	public void create() {
		TextDAO oneDao = new TextDAO();
		PaperUnit pu = oneDao.add("");
		
		MapDAO mapDao = new MapDAO();
		pu = mapDao.add("");
		
		MultiDAO multiDao = new MultiDAO();
		pu = multiDao.add("");
	}
	
	@Override
	public void read() {
		
	}
	
	@Override
	public void write() {
		
	}
}
