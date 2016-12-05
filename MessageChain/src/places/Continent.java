package places;

public class Continent {

    public final static Continent EUROPE = new Continent("Europe");
    
    private final String name;
    
    private Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
