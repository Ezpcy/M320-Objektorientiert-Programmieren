package v2;

public class Goalie extends Spieler {
    private double groesse;

    public Goalie(String name, double groesse) {
        super(name);
        this.groesse = groesse;
    }

    @Override
    public void spielen() {
        System.out.println(name + "(Goalie) hält den Ball und ist " + groesse + "m groß.");
    }
}