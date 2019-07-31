package answer;

public class TextAnswer extends Answer {
	String textAnswer;

	public String getTextAnswer() {
		return textAnswer;
	}

	public void setTextAnswer(String textAnswer) {
		this.textAnswer = textAnswer;
	}
	
	@Override
	public String readAnswer() {
		return null;
	}
	
	@Override
	public void writeAnswer(String content) {
		
	}
}
