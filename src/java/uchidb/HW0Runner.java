package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {

	//TODO you likely will need to add member variable
	private static Containers<Integer, String> cs = new ContainersIntStr();
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return cs;
	}


	public static void main(String[] args){
		
	}
}
