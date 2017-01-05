/**
 * 
 */
package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 * A simple interface to wrap some basic Java containers
 * This class uses:
 * - generics (T and S) https://en.wikipedia.org/wiki/Generics_in_Java
 * - containers  (sets,lists, and maps) http://beginnersbook.com/2015/01/difference-between-list-set-and-map-in-java/
 * - overloaded functions
 */
public interface Containers<T, S> {

	//Create a set that stores the array of T objects
	public Set<T> initSet(T[] tArray);
	
	//Create a list that stores an the array of T objects
	public List<T> initList(T[] tArray);
	
	//Create an empty map that will use type S as keys, and T as values
	public Map<S,T> initEmptyMap();
	
	//Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<S,T> mapToStoreInClass);
	
	//add a key value to store map with a boolean indicating whether to overwrite existing value
	public boolean addToMap(S key, T value, boolean overwriteExistingKey);
	
	//get a value based on a key
	public T getValueFromMap(S key);
	
	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public T getValueFromMap(S key, T defaultValue);
}
