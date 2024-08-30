/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.modul;

import java.util.Scanner;

/**
 *
 * @author ezpz
 */
public class Projekt {

    public static void main(String[] args) throws Exception {
        /* Heizung heizung = new Heizung(0, 24, 3);

        System.out.println("Increment: " + heizung.get_incr());
        System.out.println("Increment: " + heizung.get_max());
        System.out.println("Increment: " + heizung.get_min());

        heizung.increment();
        System.out.println("Temp: " + heizung.get_temp());

        heizung.set_temp(30); */

 /*   
        Filme godfather = new Filme("Godfather", "Action", 1970, 20, "German", "Paramount", 5, "DVD", "A movie about a mafia family");
        Filme godfather2 = new Filme("Godfather 2", "Action", 1972, 20, "German", "Paramount", 5, "DVD", "A movie about a mafia family");
        Filme godfather3 = new Filme("Godfather 3", "Action", 1974, 20, "German", "Paramount", 5, "DVD", "A movie about a mafia family");

        ArrayList<Medien> col = new ArrayList<>();

        col.add(godfather);
        col.add(godfather2);
        col.add(godfather3);

        col.remove(godfather3);
        
        // print all elements in the collection
        for (Medien f : col) {
            f.print();
            System.out.println("--------------------");
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your range (from 0 to ?): ");
        String range = scanner.nextLine();
        int int_range = 0;

        try {
            int_range = Integer.parseInt(range);

        } catch (Exception e) {
            System.out.println("Please input a number");
        }
        RateSpiel rateSpiel = new RateSpiel(int_range);
        while (rateSpiel.gamestatus) {
            System.out.println("Your guess: ");
            String guess = scanner.nextLine();
            RateSpiel my;
            rateSpiel.check(guess
            );
        }
        /*         for (int i = 0; i <= 100; i++) {
            double gallons;
            double litres;

            gallons = i;              //assigns a value

            litres = gallons / 3.7854;

            // print out using the System library:
            System.out.println(gallons + " gallons is " + litres + " litres.");
            if (i % 10 == 0) {
                System.out.println("");
            }

        } */
        float cel = Celsius.celsius(20);
        System.out.println(cel);
        float dis = DistanzGewitter.distanz(5);
        System.out.println(dis);
    }

}
