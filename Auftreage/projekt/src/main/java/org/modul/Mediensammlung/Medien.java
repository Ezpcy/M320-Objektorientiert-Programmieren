package org.modul.Mediensammlung;

public class Medien {

    private String title;
    private int year;
    private float price;
    private String genre;
    private String language;
    private String publisher;
    private int rating;
    private String format;
    private String description;

    public Medien(String title, String genre, int year, float price, String language, String publisher, int rating, String format, String description) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
        this.language = language;
        this.publisher = publisher;
        this.rating = rating;
        this.format = format;
        this.description = description;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Language: " + language);
        System.out.println("Publisher: " + publisher);
        System.out.println("Rating: " + rating);
        System.out.println("Format: " + format);
        System.out.println("Description: " + description);
    }
}
