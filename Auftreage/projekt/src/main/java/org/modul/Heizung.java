package org.modul;

public class Heizung {

    private int temperatue;
    private int min;
    private int max;
    private int increment;

    public Heizung(int min, int max, int increment) {
        this.min = min;
        this.max = max;
        this.increment = increment;
        this.temperatue = 15;
    }

    void set_temp(int temp) {
        if (temp > this.max) {
            System.out.println("Can't set temperatur higher then maximum.");
        } else if (temp < this.min) {
            System.out.println("Can't set temperatur lower then minimum.");
        }
        this.temperatue = temp;
    }

    void increment() {
        if ((this.temperatue + this.increment) > this.max) {
            System.out.println("Temp is already at max.");
        } else {
            this.temperatue += this.increment;
        }
    }

    void decrement() {
        if ((this.temperatue - this.increment) < this.min) {
            System.out.println("Temp is already at min.");
        } else {
            this.temperatue -= this.increment;
        }
    }

    void set_increment(int increment) {
        this.increment = increment;
    }

    void set_min(int min) {
        if (min > this.max) {
            System.out.println("Can't set min higher then max");
        } else {
            this.min = min;
        }
    }

    void set_max(int max) {
        if (max < this.min) {
            System.out.println("Can't set max lower then min");
        } else {
            this.max = max;
        }
    }

    int get_min() {
        return this.min;
    }

    int get_max() {
        return this.max;
    }

    int get_temp() {
        return this.temperatue;
    }

    int get_incr() {
        return this.increment;
    }

}
