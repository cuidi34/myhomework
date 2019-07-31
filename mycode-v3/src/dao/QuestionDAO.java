package dao;

import question.ChoiceQuestion;
import question.EssayQuestion;
import question.MapQuestion;
import question.Question;

public class QuestionDAO {
	public Question create(String content) {
		Question q;
		q = new ChoiceQuestion();
		q = new EssayQuestion();
		q = new MapQuestion();
		return q;
	}
}
