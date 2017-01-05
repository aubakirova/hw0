/**
 * 
 */
package uchidb;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * @author aelmore
 * Do not commit changes to this class 
 *
 */
public class ContainersTest {

	//Instantiated containers class
	private Containers<Integer, String> cont;
	
	//Array of ints (primitive types)
	//Uses shortcut syntax to make array
	int[] intArray = {
			1,14,4,20,14
	};
	
	//Array of Integers (class type)
	Integer[] intClassArray;
	
	//Array of Strings (class), with shortcut syntax
	String[] strArray = {
			"Uwe", "Eric","Vlaad","Sid","Richard", "Sean"
	};
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cont =  HW0Runner.getContainers();
		intClassArray = new Integer[intArray.length];
		for (int i =0; i < intArray.length; i++){
			// **NOTE** Autoboxing allows us to set values easy and use primitive types (int, char, float, etc) as a class
			// Only use them when necessary!
			// Putting primitive types into containers is primary reason why
			intClassArray[i] = intArray[i];
		}
		
		
	}

	@Test
	public void testSetCreation() {
		Set<Integer> s1 = cont.initSet(intClassArray);
		assertTrue("Size of set is correct", 4 == s1.size());
		assertTrue("Contains 4", s1.contains(intArray[2])); //Notice the autoboxing
	}
	
	@Test 
	public void testListCreation() {
		List<Integer> l1 = cont.initList(intClassArray);
		assertTrue("Size of set is correct", 5 == l1.size());
		assertTrue("Contains 4", l1.contains(intArray[2])); //Notice the autoboxing
		for (int i =0; i < intArray.length; i++){
			assertTrue("Values are equal", intArray[i]== l1.get(i));
		}
	}

	@Test 
	public void testMapFunctionality(){
		Map<String, Integer> myMap = cont.initEmptyMap();
		
		cont.storeMap(myMap);
		for (int i =0; i < intArray.length; i++){
			cont.addToMap(strArray[i], intClassArray[i], true);
		}
		boolean expFalse = cont.addToMap("Uwe", 1000, false);
		boolean expTrue = cont.addToMap("Richard", new Integer(42), true);
		
		assertTrue("Map correct", intClassArray[2] == cont.getValueFromMap(strArray[2]));
		assertTrue("Map correct", intClassArray[0] == cont.getValueFromMap(strArray[0]));
		assertTrue("Map correct", intClassArray[0] != cont.getValueFromMap(strArray[1]));
		assertTrue("Map correct", 42 == cont.getValueFromMap("Richard"));
		assertTrue("Map correct", null == cont.getValueFromMap(strArray[5]));
		assertTrue("Map correct", new Integer(-1) != cont.getValueFromMap(strArray[5], new Integer(-1)));
		assertFalse(expFalse);
		assertTrue(expTrue);
		
	}

	@Test 
	public void testContSingleton(){
		Containers<Integer, String> cont2 = HW0Runner.getContainers();
		assertTrue(cont == cont2);
		assertTrue("Map correct", intClassArray[0] == cont2.getValueFromMap(strArray[0]));
		
		
	}
}
