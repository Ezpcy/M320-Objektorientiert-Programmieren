package d2;
import java.util.ArrayList;
import java.util.List;

/**
 * Flug class holds a list of "Passagier" and has functions to add, delete and print out the list
 *
 */
public class Flug {
    List<Passagier> passagiere = new ArrayList<Passagier>();

    /**
     * Prints out the names of the passengers in the list
     */
    void passagierListeAusgeben() {
        for(Passagier p: passagiere) {
            p.nameAusgeben();
        }
    }

    /**
     * Adds a passenger to the list
     * 
     * @param p
     */
    void passagierHinzufügen(Passagier p) {
        // check if p is already in the list
        if(!passagiere.contains(p)) {
            passagiere.add(p);
        } else {
            System.out.println("Passagier bereits in der Liste");
        }
    }

    /**
     * Removes a passenger from the list
     * 
     * @param p
     */
    void passagierEntfernen(Passagier p) {
        if(passagiere.contains(p)) {
            passagiere.remove(p);
        } else {
            System.out.println("Passagier nicht in der Liste");
        }
    }
}
