package v2;

public class Verteidiger extends Spieler {
    public Verteidiger(String name) {
        super(name);
    }

    @Override
    public void spielen() {
        System.out.println(name + "(Verteidiger) verteidigt.");
    }
}