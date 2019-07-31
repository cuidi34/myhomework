package dao;

import answer.Answer;
import answer.MapAnswer;
import answer.MultiChoiceAnswer;
import answer.OneChoiceAnswer;
import answer.RankAnswer;
import answer.TextAnswer;

public class AnswerDAO {
	public Answer create(String content) {
		Answer a;
		a = new MapAnswer();
		a = new MultiChoiceAnswer();
		a = new OneChoiceAnswer();
		a = new RankAnswer();
		a = new TextAnswer();
		return a;
	}
}
