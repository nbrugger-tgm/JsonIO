package examples.json;

import java.util.HashMap;

/**
 * This is the ToSerialize Class
 * 
 * @author Nils
 * @version 2018-07-07
 */
public class ToSerialize {
	private int number = 238;
	private Object[] objectArray = new Object[] {123, new int[] { 1, 2, 3 }};
	private HashMap<String, Object> map = new HashMap<>();

	public ToSerialize() {
		map.put("key1", null);
		map.put("key2", "I BIMZ EINZ SCHEIZER DUD");
	}
}
