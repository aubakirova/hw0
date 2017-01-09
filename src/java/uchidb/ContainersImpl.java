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

public class ContainersImpl<T,S> implements Containers<T, S> {
	private Map<S,T> map = initEmptyMap();

	//Create a set that stores the array of T objects
	public Set<T> initSet(T[] tArray) {
		Set<T> set = new HashSet<T>();
		for (int i =0; i < tArray.length; i++){
			set.add(tArray[i]);
		}
		return set;
	}
	
	//Create a list that stores an the array of T objects
	public List<T> initList(T[] tArray) {
		List<T> list = new LinkedList<T>();
		for (int i =0; i < tArray.length; i++){
			list.add(tArray[i]);
		}
		return list;
	}
	
	//Create an empty map that will use type S as keys, and T as values
	public Map<S,T> initEmptyMap() {
		return new HashMap<S,T>();
	}
	
	//Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<S,T> mapToStoreInClass) {
		map = mapToStoreInClass;
	}
	
	//add a key value to store map with a boolean indicating whether to overwrite existing value
	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		if (map.containsKey(key) && !overwriteExistingKey)
			return overwriteExistingKey;
		map.put(key, value);
		return true;
	}
	
	//get a value based on a key
	public T getValueFromMap(S key) {
		return map.get(key);
	}
	
	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public T getValueFromMap(S key, T defaultValue) {
		if (!map.containsKey(key))
			return defaultValue;
		return map.get(key);
	}
}