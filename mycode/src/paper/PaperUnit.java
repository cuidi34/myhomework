package paper;

import answer.Answer;
import question.Question;

public class PaperUnit {
	Answer answer;
	Answer sAnswer;
	Question question;
	
	public PaperUnit(Answer answer, Answer sAnswer, Question question) {
		super();
		this.answer = answer;
		this.sAnswer = sAnswer;
		this.question = question;
	}
	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Answer getsAnswer() {
		return sAnswer;
	}
	public void setsAnswer(Answer sAnswer) {
		this.sAnswer = sAnswer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
