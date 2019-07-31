package question;

import java.util.ArrayList;
import java.util.List;

public class MapQuestion extends Question {
	
	List<String> leftChoiceList = new ArrayList<String>();
	List<String> rightChoiceList = new ArrayList<String>();
	
	public List<String> getLeftChoiceList() {
		return leftChoiceList;
	}
	public void setLeftChoiceList(List<String> leftChoiceList) {
		this.leftChoiceList = leftChoiceList;
	}
	public List<String> getRightChoiceList() {
		return rightChoiceList;
	}
	public void setRightChoiceList(List<String> rightChoiceList) {
		this.rightChoiceList = rightChoiceList;
	}
	
	@Override
	String readQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	void writeQuestion(String content) {
		// TODO Auto-generated method stub
		
	}
}
