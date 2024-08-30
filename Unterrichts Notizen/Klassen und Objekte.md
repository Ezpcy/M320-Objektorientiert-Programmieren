# Klassen und Objekte

In der objektorientierten Programmierung wird der Code in Klassen unterteilt. Eine Klasse ist eine Schablone für ein Objekt. Ein Objekt ist eine Instanz einer Klasse. Klassen können Attribute und Methoden haben. Attribute sind Variablen, die zu einem Objekt gehören. Methoden sind Funktionen, die zu einem Objekt gehören. Klassen können auch Vererbung und Polymorphie nutzen.

## Grundgerüst

```java
package com.example.class_objects; // definiert an welchem Ort die Klasse ist

// definiert den Rahmen der Klasse
public class House {

}
```

## Attribute

Attribute sind Variablen, die zu einem Objekt gehören. Attribute können auch als Eigenschaften oder Felder bezeichnet werden.

```java
public class House {
    // Attributes of the house
    private String familyName;
    private String street;
    private int houseNumber;
    private int numberOfRooms;
    private double price;
}
```

## Initialisierung mit einem Konstruktor

Ein Konstruktor ist eine spezielle Methode, die aufgerufen wird, wenn ein Objekt erstellt wird. Der Konstruktor hat den gleichen Namen wie die Klasse und hat keinen Rückgabewert. Der Konstruktor kann auch Parameter haben, die beim Erstellen des Objekts übergeben werden.

```java
public class House {
    // Attributes of the house
    private String familyName;
    private String street;
    private int houseNumber;
    private int numberOfRooms;
    private double price;

    // Constructor
    public House() {
        familyName = "";
        street = "";
        houseNumbefr = 0;
        numberOfRooms = 0;
        price = 0.0;
    }
}
```

## Getter und Setter

Mit Getter- und Setter-Methoden können die Attribute eines Objekts gelesen und verändert werden. Getter-Methoden haben den Namen `get` gefolgt vom Attributnamen. Setter-Methoden haben den Namen `set` gefolgt vom Attributnamen.

```java
public class House {
    // Attributes of the house
    private String familyName;
    private String street;
    private int houseNumber;
    private int numberOfRooms;
    private double price;

    // Constructor
    public House() {
        familyName = "";
        street = "";
        houseNumber = 0;
        numberOfRooms = 0;
        price = 0.0;
    }

    // Getter and Setter
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
```

## Erstellen eines Objekts

Ein Objekt wird mit dem `new`-Schlüsselwort erstellt. Der Konstruktor wird aufgerufen, um das Objekt zu initialisieren.

```java
public class Main {
    public static void main(String[] args) {
        // Create a new house object
        House house = new House();
    }
}
```

Klassennamen beginnen mit einem Grossbuchstaben, zusammengesetzte Wörter werden im CamelCase geschrieben z.B. HouseCity.
Die Klasse House wird in der Datei House.java gespeichert!
der Konstruktor hat den gleichen Namen der Klasse + ()!
Objektnamen starten klein und werden auch mit CamelCase beschrieben.

Klassennamen beginnen mit einem Grossbuchstaben, zusammengesetzte Wörter werden im CamelCase geschrieben z.B. HouseCity.
Die Klasse House wird in der Datei House.java gespeichert!
der Konstruktor hat den gleichen Namen der Klasse + ()!
Objektnamen starten klein und werden auch mit CamelCase beschrieben.

- Klassennamen beginnen mit einem Grossbuchstaben, zusammengesetzte Wörter werden im CamelCase geschrieben z.B. HouseCity.
- Die Klasse House wird in der Datei House.java gespeichert!
- der Konstruktor hat den gleichen Namen der Klasse + ()!
- Objektnamen starten klein und werden auch mit CamelCase beschrieben.
