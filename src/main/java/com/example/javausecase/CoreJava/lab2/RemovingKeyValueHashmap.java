package lab2;

import java.util.HashMap;

public class RemovingKeyValueHashmap {
	public static void main(String[] args) {
 	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	    hash_map.put(10, "Ram");
	    hash_map.put(15, "Sham");
	    hash_map.put(20, "Ravi");
	    hash_map.put(25, "Latta");
	    hash_map.put(30, "Sun");
	    System.out.println("Initial Mappings are: " + hash_map);     
	    String returned_value = (String)hash_map.remove(20);
	    System.out.println("Returned value is: "+ returned_value);
	    System.out.println("New map is: "+ hash_map);
	}
}
