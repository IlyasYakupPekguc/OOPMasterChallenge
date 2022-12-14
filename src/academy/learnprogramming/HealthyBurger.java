package academy.learnprogramming;

import java.util.Scanner;

public class HealthyBurger extends BasicBurger{

    private int healthySauce;
    private int cucumber;
    private int totalPrice;
    private int num = getNum();
    private boolean flag = true;

    public HealthyBurger() {
    }

    public HealthyBurger(String bread, String meat) {
        super(bread, meat);
        this.healthySauce = 7;
        this.cucumber = 6;
        this.totalPrice = 7;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public void Selecting() {
        int choice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Select \n 0 for the healthy Sauce \n 1 for the cucumber \n 2 for the standard additions \n and 3 to stop adding an addition.");
        choice = sc.nextInt();

        switch (choice){
            case 0:
                System.out.println("You chose Healthy Sauce. The price is: " + healthySauce);
                totalPrice += healthySauce;
                break;

            case 1:
                System.out.println("You chose Cucumber. The price is: "  +cucumber);
                totalPrice += cucumber;
                break;

            case 2:
                super.Selecting();
                break;

            case 3:
                System.out.println("You didn't want or could add a new addition.");
                System.out.println("Your Total price is: " +totalPrice);
                num = 3;
                break;

            default:
                System.out.println("You Chose a invalid value");
                break;
        }
        if(num == 3){
            System.out.println("You have added the max amount of additions You can't add other additions.");
            System.out.println("\n");
            System.out.println("Your Burger contains: \n"
                    +"Base burger: " + super.getBread() + " and " + super.getMeat()+ "\n and some additions.");
            System.out.println("Your Total price is: " +totalPrice);
        }else {
            num++;
            Selecting();
        }
    }
    //add a function for the healthy options.
    //see how to connect the total price option.
}
