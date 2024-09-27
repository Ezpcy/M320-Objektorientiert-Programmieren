package v2;

public abstract class Spieler {
    protected String name;

    public Spieler(String name) {
        this.name = name;
    }
    void zeigeName() {
        System.out.println(name);
    }

    public abstract void spielen();
}