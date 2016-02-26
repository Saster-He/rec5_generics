
package rec5_generics;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import java.util.Set;

public class Generics {
    
    public static void main(String[] args) {
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
        
        List<Dalmatian> pupList = makeList(puppies);
        Map<Integer, Dalmatian> pupMap = makeMap(puppies);
        arrayExample(puppies);
        listExample(pupList);
        mapExample(pupMap);

        Map<String, Dalmatian> ntdMap = mapNameToDalmatian(puppies);
        nameMapExample(ntdMap);
    }

    public static Map<Integer, Dalmatian> makeMap(Dalmatian[] puppies) {
        Map<Integer, Dalmatian> map = new HashMap<Integer, Dalmatian>();
        for(int i = 0; i < puppies.length; i++) {
            map.put(i, puppies[i]);
        }
        return map;
    }

    public static List<Dalmatian> makeList(Dalmatian[] puppies) {
        List<Dalmatian> list = new LinkedList<Dalmatian>();
        for(int i = 0; i < puppies.length; i++) {
            Dalmatian pup = puppies[i];
            list.add(i, pup);
        }
        return list;
    }
    
    public static void arrayExample(Dalmatian[] puppies) {
        System.out.println("Array Example");
        for(int i = 0; i < puppies.length; i++) {
            Dalmatian pup = puppies[i];
            System.out.println(pup);
        }
        System.out.println();
    }

    public static void listExample(List<Dalmatian> puppies) {
        System.out.println("List Example");
        for(int i = 0; i < puppies.size(); i++) {
            Dalmatian pup = puppies.get(i);
            System.out.println(pup.getName() + " has " +
                               pup.getNumSpots() + " spots.");
        }
        System.out.println();
    }

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
