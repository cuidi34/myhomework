package dao;

import answer.OneChoiceAnswer;
import paper.PaperUnit;
import question.ChoiceQuestion;

public class OneDAO implements PaperUnitDAO {
	
	@Override
	public PaperUnit add(String content) {
		return new PaperUnit(new OneChoiceAnswer(),
				new OneChoiceAnswer(), new ChoiceQuestion());
	}
	
	@Override
	public void save(String content, PaperUnit unit) {
		
	}

}
