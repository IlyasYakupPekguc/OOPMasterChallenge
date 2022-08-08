package academy.learnprogramming;

import java.util.Scanner;

public class HealthyBurger extends BasicBurger{

    private String healthySauce;
    private String cucumber;

    public HealthyBurger(String bread, String meat, String healthySauce, String cucumber) {
        super(bread, meat);
        this.healthySauce = healthySauce;
        this.cucumber = cucumber;
    }

    @Override
    public void Selecting() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select \n  0 for the healthy additions \n 1 for the standart additions");
        choice = sc.nextInt();

        switch (choice){
            case 0:


        }
        super.Selecting();
    }

    //add a function for the healthy options.
    //see how to connect the total price option.
}
