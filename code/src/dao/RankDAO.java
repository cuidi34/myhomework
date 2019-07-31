package dao;

import answer.RankAnswer;
import paper.PaperUnit;
import question.ChoiceQuestion;

public class RankDAO implements PaperUnitDAO {

	@Override
	public PaperUnit add(String content) {
		return new PaperUnit(new RankAnswer(),
				new RankAnswer(), new ChoiceQuestion());
	}
	
	@Override
	public void save(String content, PaperUnit unit) {
		
	}
}
