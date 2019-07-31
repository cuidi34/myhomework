package answer;

public class OneChoiceAnswer extends Answer {
	int selectItem;
	
	public int getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(int selectItem) {
		this.selectItem = selectItem;
	}
	
	@Override
	public String readAnswer() {
		return null;
	}
	
	@Override
	public void writeAnswer(String content) {
		
	}
}
