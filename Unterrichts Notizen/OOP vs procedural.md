# OOP vs Procedural

## Prozedurale Programmierung

Bei der prozeduralen Programmierung wird der Code in Funktionen unterteilt. Diese Funktionen können aufgerufen werden und führen dann eine bestimmte Aufgabe aus. Die Funktionen können dabei auf globale Variablen zugreifen und diese auch verändern. Dies kann zu Problemen führen, wenn mehrere Funktionen auf die gleichen Variablen zugreifen und diese verändern.

**Prozedural**:

```java
int x = 0;

void increment() {
    x++;
}

void decrement() {
    x--;
}
```

## Objektorientierte Programmierung

Bei der objektorientierten Programmierung wird der Code in Klassen unterteilt. Eine Klasse ist eine Schablone für ein Objekt. Ein Objekt ist eine Instanz einer Klasse. Klassen können Attribute und Methoden haben. Attribute sind Variablen, die zu einem Objekt gehören. Methoden sind Funktionen, die zu einem Objekt gehören. Klassen können auch Vererbung und Polymorphie nutzen.

**Objektorientiert**:

```java
class Counter {
    private int x = 0;

    void increment() {
        x++;
    }

    void decrement() {
        x--;
    }
}
```

## Unterschiede

- **Prozedural**:

  - Funktionen
  - Globale Variablen
  - Keine Kapselung
  - Keine Vererbung
  - Keine Polymorphie

- **Objektorientiert**:
  - Klassen
  - Attribute
  - Methoden
  - Kapselung
  - Vererbung
  - Polymorphie
