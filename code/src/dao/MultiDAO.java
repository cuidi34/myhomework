package dao;

import answer.MultiChoiceAnswer;
import paper.PaperUnit;
import question.ChoiceQuestion;

public class MultiDAO implements PaperUnitDAO {
	
	@Override
	public PaperUnit add(String content) {
		return new PaperUnit(new MultiChoiceAnswer(),
				new MultiChoiceAnswer(), new ChoiceQuestion());
	}
	
	@Override
	public void save(String content, PaperUnit unit) {
		
	}
}
