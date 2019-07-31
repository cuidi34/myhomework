package answer;

import java.util.HashMap;
import java.util.Map;

public class MapAnswer extends Answer {
	Map<Integer, Integer> itemMap = new HashMap<Integer, Integer>();

	public Map<Integer, Integer> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<Integer, Integer> itemMap) {
		this.itemMap = itemMap;
	}
	
	@Override
	public String readAnswer() {
		return null;
	}
	
	@Override
	public void writeAnswer(String content) {
		
	}
}
