package org.example;

public class Lemonade {
    // Static field examples
    public static int defaultSugar = 2;
    public static int defaultIce = 3;
    public static int defaultLemons = 4;

    private int lemons;
    private int sugar;
    private int ice;

    public Lemonade() {
        this.lemons = defaultLemons;
        this.sugar = defaultSugar;
        this.ice = defaultIce;
    }

    public Lemonade(int lemons, int sugar, int ice) {
        this.lemons = lemons;
        this.sugar = sugar;
        this.ice = ice;
    }

    public int getLemons() {
        return lemons;
    }

    public void setLemons(int lemons) {
        this.lemons = lemons;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    // Create a method called mix that takes two Lemonade objects and returns a new Lemonade object with
    // the sum of the lemons, sugar, and ice from the two Lemonade objects.
    //
    // HINT: You can get the counts from the two Lemonade objects using their get methods, e.g.:
    // int newLemonadeLemons = lemonade1.getLemons() + lemonade2.getLemons();
    public static Lemonade mix(Lemonade input1, Lemonade input2) {
        int newLemons = input1.getLemons() + input2.getLemons();
        int newSugar = input1.getSugar() + input2.getSugar();
        int newIce = input1.getIce() + input2.getIce();

        return new Lemonade(newLemons, newSugar, newIce);
    }
}
