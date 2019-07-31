package answer;

import java.util.ArrayList;
import java.util.List;

public class RankAnswer extends Answer {
	List<Integer> rankedItemList = new ArrayList<Integer>();

	public List<Integer> getRankedItemList() {
		return rankedItemList;
	}

	public void setRankedItemList(List<Integer> rankedItemList) {
		this.rankedItemList = rankedItemList;
	}
	
	@Override
	public String readAnswer() {
		return null;
	}
	
	@Override
	public void writeAnswer(String content) {
		
	}
}
