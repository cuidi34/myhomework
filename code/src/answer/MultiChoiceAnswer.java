package answer;

import java.util.ArrayList;
import java.util.List;

public class MultiChoiceAnswer extends Answer {
	List<Integer> selectItemList = new ArrayList<Integer>();

	public List<Integer> getSelectItemList() {
		return selectItemList;
	}

	public void setSelectItemList(List<Integer> selectItemList) {
		this.selectItemList = selectItemList;
	}
	
	@Override
	public String readAnswer() {
		return null;
	}
	
	@Override
	public void writeAnswer(String content) {
		
	}
}
