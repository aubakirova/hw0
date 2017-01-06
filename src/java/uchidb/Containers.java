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

	// Create and return a set that stores the array of T objects
	// You do not need to create your own set implementation and 
	// can use an existing set class.
	public Set<T> initSet(T[] tArray);
	
	// Create and return a list that stores an the array of T objects
	// You do not need to create your own list implementation and 
	// can use an existing list class.
	public List<T> initList(T[] tArray);
	
	// Create and return an empty map that will use type S as keys, and T as values
	// You do not need to create your own map implementation and 
	// can use an existing map class.
	public Map<S,T> initEmptyMap();
	
	// Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<S,T> mapToStoreInClass);
	
	// Add a key value to the stored/local map with a boolean indicating whether to overwrite existing value
	// The return value indicates if you added the key value pair to the map
	// You do not need to check if the value changed or not (e.g. no need to compare values)
	public boolean addToMap(S key, T value, boolean overwriteExistingKey);
	
	// Return a value from the stored/local map based on the key
	public T getValueFromMap(S key);
	
	// An overloaded function to get a value from the store/local map, but with a default value
	// if the key is not present in the map.
	public T getValueFromMap(S key, T defaultValue);
}
