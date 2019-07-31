package exam;

import dao.MapDAO;
import dao.MultiDAO;
import dao.OneDAO;
import paper.Paper;
import paper.PaperUnit;

public class EnglishExam extends Paper {
	
	@Override
	public void create() {
		OneDAO oneDao = new OneDAO();
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
