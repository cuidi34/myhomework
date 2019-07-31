package dao;

import answer.TextAnswer;
import paper.PaperUnit;
import question.EssayQuestion;

public class TextDAO implements PaperUnitDAO {
	
	@Override
	public PaperUnit add(String content) {
		return new PaperUnit(new TextAnswer(), 
				new TextAnswer(), new EssayQuestion());
	}
	
	@Override
	public void save(String content, PaperUnit unit) {
		
	}
}
