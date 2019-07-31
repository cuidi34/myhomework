package dao;

import answer.MapAnswer;
import paper.PaperUnit;
import question.MapQuestion;

public class MapDAO implements PaperUnitDAO {
	@Override
	public PaperUnit add(String content) {
		return new PaperUnit(new MapAnswer(),
				new MapAnswer(), new MapQuestion());
	}
	
	@Override
	public void save(String content, PaperUnit unit) {
		
	}
}
