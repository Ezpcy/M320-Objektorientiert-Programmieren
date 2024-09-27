package v2;

public class Mannschaft {
    public Mannschaft() {
        Spieler angreifer = new Angreifer("Angreifer");
        Spieler verteidiger = new Verteidiger("Verteidiger");
        Spieler goalie = new Goalie("Goalie", 1.80);
        angreifer.zeigeName();
        angreifer.spielen();
        verteidiger.zeigeName();
        verteidiger.spielen();
        goalie.zeigeName();
        goalie.spielen();
    }
}