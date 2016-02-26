
package rec5_generics;

import java.util.List;
import java.util.LinkedList;

import java.util.Map;
import java.util.HashMap;

public class Generics {
    
    public static void main(String[] args) {
	// Initialize an array as a default test case
        Dalmatian[] puppies = new Dalmatian[9];
        puppies[0] = new Dalmatian("Pongo", 4);
        puppies[1] = new Dalmatian("Perdita", 5);
        puppies[2] = new Dalmatian("Patch", 3);
        puppies[3] = new Dalmatian("Lucky", 14);
        puppies[4] = new Dalmatian("Rolly", 18);
        puppies[5] = new Dalmatian("Penny", 36);
        puppies[6] = new Dalmatian("Freckles", 49);
        puppies[7] = new Dalmatian("Pepper", 72);
        puppies[8] = new Dalmatian("Whitie", 0);

	// Build an analogy between arrays and lists and maps
	// Start by showing how we use arrays
        arrayExample(puppies);
	arrayForEachExample(puppies);

	// And then compare to how we use lists
	// A list can essentially be treated like a
	// dynamically expanding array -
	// we don't need to know how many items we're
	// putting into it when we initialze the list
        List<Dalmatian> pupList = makeList(puppies);
        listExample(pupList);
	listForEachExample(pupList);

	// And then to maps
        Map<Integer, Dalmatian> pupMap = makeMap(puppies);
        mapExample(pupMap);
	
	// Now show how maps generalize arrays to use strings as indices/keys
	// Note the minor difference in this one's output!
	// In general, when iterating over the key-value pairs in a map,
	// we have no idea what order we're going to go!
        Map<String, Dalmatian> ntdMap = mapNameToDalmatian(puppies);
        nameMapExample(ntdMap);
    }

    // Creates a list containing the same elements as the array parameter
    // The elements will be placed in the same order as they are in the array
    public static List<Dalmatian> makeList(Dalmatian[] puppies) {
	// Several types of list exist, ArrayList is another example
        List<Dalmatian> list = new LinkedList<Dalmatian>();
        for(int i = 0; i < puppies.length; i++) {
            Dalmatian pup = puppies[i];
	    // Note that list.add(index, item) is going to be inefficient
	    // when compared to something like list.push or list.addLast
            list.add(i, pup);
        }
        return list;
    }

    // Creates a map with elements indexed by their position in the array
    // The index for an element is also called the key
    public static Map<Integer, Dalmatian> makeMap(Dalmatian[] puppies) {
        Map<Integer, Dalmatian> map = new HashMap<Integer, Dalmatian>();
        for(int i = 0; i < puppies.length; i++) {
            map.put(i, puppies[i]);
        }
        return map;
    }

    // Just the example code for accessing elements of the array
    public static void arrayExample(Dalmatian[] puppies) {
        System.out.println("Array Example");
        for(int i = 0; i < puppies.length; i++) {
            Dalmatian pup = puppies[i];
            System.out.println(pup);
        }
        System.out.println();
    }
    
    // Just the example code for accessing elements of the array with for-each
    public static void arrayForEachExample(Dalmatian[] puppies) {
        System.out.println("Array For-Each Example");
	// Access the elements with a for-each loop
	// This is equivalent to the original array example
        for(Dalmatian pup : puppies) {
            System.out.println(pup);
        }
        System.out.println();
    }

    // Just the example code for accessing elements of the list
    // This has the same output as arrayExample
    public static void listExample(List<Dalmatian> puppies) {
        System.out.println("List Example");
        for(int i = 0; i < puppies.size(); i++) {
            Dalmatian pup = puppies.get(i);
            System.out.println(pup.getName() + " has " +
                               pup.getNumSpots() + " spots.");
        }
        System.out.println();
    }

    // Just the example code for accessing elements of the list with for-each
    // This has the same output as arrayExample
    public static void listForEachExample(List<Dalmatian> puppies) {
	System.out.println("List For-Each Example");
	for(Dalmatian pup : puppies) {
	    System.out.println(pup);
	}
	System.out.println();
    }

    // Just the example code for accessing elements of the map
    // This has the same output as arrayExample
    public static void mapExample(Map<Integer, Dalmatian> puppies) {
        System.out.println("Map as Array Example");
        for(int i = 0; i < puppies.size(); i++) {
            Dalmatian pup = puppies.get(i);
            System.out.println(pup.getName() + " has " +
                               pup.getNumSpots() + " spots.");
        }
        System.out.println();
    }

    public static Map<String, Dalmatian> mapNameToDalmatian(Dalmatian[] puppies) {
        // Maps are like a generalization of arrays
        // Unlike arrays, you have no guarantee 
        Map<String, Dalmatian> map = new HashMap<String, Dalmatian>();
        for(int i = 0; i < puppies.length; i++) {
            Dalmatian pup = puppies[i];
            map.put(pup.getName(), pup);
        }
        return map;
    }

    public static void nameMapExample(Map<String, Dalmatian> puppies) {
        System.out.println("Map as Name Lookup Example");
        
        // This time with the for-each syntax
        // This iterates over all of the dalmatians currently in the map
        // Note the change in the order of the output!
        for(String name : puppies.keySet()) {
            System.out.println(name + ": " + puppies.get(name));
        }
        System.out.println();
    }
}
