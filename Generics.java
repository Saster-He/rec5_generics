
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

class Dalmatian {
    private String name;
    private int numSpots;

    public Dalmatian() {
        name = "Spot";
        numSpots = 101;
    }

    public Dalmatian(String myName,
                     int spots) {
        name = myName;
        numSpots = spots;
    }

    String getName() {
        return name;
    }

    int getNumSpots() {
        return numSpots;
    }
}

public class Generics {
    
    public static void main(String[] args) {
        Dalmatian[] puppies = new Dalmatian[9];
        puppies[0] = new Dalmatian("Latch", 4);
        puppies[1] = new Dalmatian("Jolly", 5);
        puppies[2] = new Dalmatian("Lenny", 3);
        puppies[3] = new Dalmatian("Salter", 14);
        puppies[4] = new Dalmatian("Blob", 0);
        puppies[5] = new Dalmatian("Blot", 1);
        puppies[6] = new Dalmatian("Dot", 2);
        puppies[7] = new Dalmatian("Blackie", 1);
        puppies[8] = new Dalmatian("Whitie", 0);
        
        List<Dalmatian> pupList = makeList(puppies);
        Map<Integer, Dalmatian> pupMap = makeMap(puppies);
        arrayExample(puppies);
        listExample(pupList);
        mapExample(pupMap);
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
            System.out.println(pup.getName() + " has " +
                               pup.getNumSpots() + " spots.");
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
        System.out.println("Map Example");
        for(int i = 0; i < puppies.size(); i++) {
            Dalmatian pup = puppies.get(i);
            System.out.println(pup.getName() + " has " +
                               pup.getNumSpots() + " spots.");
        }
        System.out.println();
    }
}
