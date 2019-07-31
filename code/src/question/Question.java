package question;

public abstract class Question {
	abstract void writeQuestion(String content);
	abstract String readQuestion();
	
	String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
