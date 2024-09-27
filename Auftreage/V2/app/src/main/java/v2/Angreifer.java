package v2;

public class Angreifer extends Spieler {

    public Angreifer(String name) {
        super(name);
    }

    void jogTraining() {
        System.out.println(name + "(Angreifer) führt ein Jogtraining aus.");
    }

    @Override
    public void spielen() {
        System.out.println(name +"(Angreifer) greift an.");
    }
}