package org.modul;

import java.util.Random;

public class RateSpiel {

    public boolean gamestatus;
    private int number;
    private int range;

    public RateSpiel(int range) {
        if (range < 5) {
            System.out.println("Number for range must be higher than 5.");
            return;
        }
        this.range = range;
        Random rand = new Random();
        this.number = rand.nextInt(range + 1);
        this.gamestatus = true;
    }

    public RateSpiel() {
        this.number = 3;
        this.gamestatus = true;
    }

    void check(String n) {
        switch (n.toLowerCase()) {
            case "q" -> {
                System.out.println("Quiting the game");
                this.gamestatus = false;
            }
            default -> {
                try {
                    int number = Integer.parseInt(n);
                    if (number == this.number) {
                        System.out.println("You win!");
                        this.gamestatus = false;
                    }
                    if (number < this.number) {
                        System.out.println("Too small!");
                    }
                    if (number > this.number) {
                        System.out.println("Too big!");
                    }
                    if (number > this.range + 1) {
                        System.out.println("Please input a number between 0 and " + this.range);
                    }
                } catch (Exception e) {

                    System.out.println("Please input a number between 0 and " + this.range);
                }
            }
        }
    }

}
