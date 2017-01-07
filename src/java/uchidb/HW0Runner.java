package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {
	private static Containers<Integer, String> cs = new ContainersIntStr();
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		return cs;
	}


	public static void main(String[] args){
		
	}
}
