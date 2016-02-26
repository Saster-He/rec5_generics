
package rec5_generics;

public class Dalmatian {
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

    @Override
    public String toString() {
        return name + " has " + numSpots + " spots.";
    }

    public String getName() {
        return name;
    }

    public int getNumSpots() {
        return numSpots;
    }
}
