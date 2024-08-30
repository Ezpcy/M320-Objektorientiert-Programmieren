package org.modul;

public class Celsius {

    public static float fahrenheit(float n) {
        return (n - 32) * 5 / 9;
    }

    public static float celsius(float n) {
        return (n * 9 / 5) + 32;
    }
}
