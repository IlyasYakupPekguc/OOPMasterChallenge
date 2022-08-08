package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        BasicBurger basicBurger = new BasicBurger("White bread", "Chicken");

        /*basicBurger.Selecting();*/

        HealthyBurger healthyBurger = new HealthyBurger("brown Bread", "Vegan meat");
        healthyBurger.Selecting();
    }
}
