package question;

import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question {
	List<String> choiceList = new ArrayList<String>();

	public List<String> getChoiceList() {
		return choiceList;
	}

	public void setChoiceList(List<String> choiceList) {
		this.choiceList = choiceList;
	}
	
	@Override
	String readQuestion() {
		return null;
	}
	
	@Override
	void writeQuestion(String content) {	
	}
}
