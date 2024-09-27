package d2;


/**
 * Passagier class holds the name of the passenger and has a function to print out the name
 *
 */
public class Passagier {
    String name;

    /**
     * Constructor for the Passagier class
     * 
     * @param n
     */
    public Passagier(String n) {
        name = n;
        
    }

    /**
     * Prints out the name of the passenger
     */
    void nameAusgeben() {
        System.out.println(name);
    }
}
