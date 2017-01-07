/**
 * 
 */
package uchidb;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/**
 * @author aubakirova
 */

public class ContainersIntStr implements Containers<Integer, String> {
	private Map<String,Integer> map = null;

	//Create a set that stores the array of T objects
	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i =0; i < tArray.length; i++){
			set.add(tArray[i]);
		}
		return set;
	}
	
	//Create a list that stores an the array of T objects
	public List<Integer> initList(Integer[] tArray) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i =0; i < tArray.length; i++){
			list.add(tArray[i]);
		}
		return list;
	}
	
	//Create an empty map that will use type S as keys, and T as values
	public Map<String,Integer> initEmptyMap() {
		return new HashMap<String,Integer>();
	}
	
	//Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		map = mapToStoreInClass;
	}
	
	//add a key value to store map with a boolean indicating whether to overwrite existing value
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (map.containsKey(key) && !overwriteExistingKey)
			return overwriteExistingKey;
		map.put(key, value);
		return true;
	}
	
	//get a value based on a key
	public Integer getValueFromMap(String key) {
		return map.get(key);
	}
	
	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (!map.containsKey(key))
			return defaultValue;
		return map.get(key);
	}
}
