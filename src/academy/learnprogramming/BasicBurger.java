package academy.learnprogramming;

import java.util.Scanner;

public class BasicBurger {

    private int Lettuce;
    private int Carrot;
    private int Cheese;
    private int Tomato;
    private int Pickle;
    private int Sauce;
    private String bread;
    private String meat;
    private int totalPrice;
    private int num;

    //in the Constructor the prices of the additions are set.
    public BasicBurger(String bread, String meat) {
        Lettuce = 1;
        Carrot = 2;
        Cheese = 3;
        Tomato = 2;
        Pickle = 1;
        Sauce = 4;
        this.bread = bread;
        this.meat = meat;
        this.totalPrice = 5;
        this.num = 0;
    }

    public BasicBurger() {
    }

    public int getLettuce() {
        return Lettuce;
    }
    public int getCarrot() {
        return Carrot;
    }
    public int getCheese() {
        return Cheese;
    }
    public int getTomato() {
        return Tomato;
    }
    public int getPickle() {
        return Pickle;
    }
    public int getSauce() {
        return Sauce;
    }
    public String getBread() {
        return bread;
    }
    public String getMeat() {
        return meat;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public int getNum() {
        return num;
    }

    //letting the customer select an addition to the burger.
    //the code could be simplified using a for loop but to get better at recursive i preferred to use this method.
    public void Selecting(){
        int choice = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Your Current total price is:" + totalPrice);
            System.out.println("Select \n  0 for Lettuce \n 1 for Carrot \n 2 for Cheese \n 3 for Tomato \n 4 for Pickles \n 5 fo rSauce \n and 6 to stop adding an addition.\n");
            choice = sc.nextInt();
        switch (choice){
            case 0:
                System.out.println("You chose Lettuce of the price: " + Lettuce);
                totalPrice += Lettuce;
                break;

            case 1:
                System.out.println("You chose Carrot of the price: " + Carrot);
                totalPrice += Carrot;
                break;

            case 2:
                System.out.println("You chose Cheese of the price: " + Cheese);
                totalPrice += Cheese;
                break;

            case 3:
                System.out.println("You chose Tomato of the price: " + Tomato);
                totalPrice += Tomato;
                break;

            case 4:
                System.out.println("You chose Pickle of the price: " + Pickle);
                totalPrice += Pickle;
                break;

            case 5:
                System.out.println("You chose Sauce of the price: " + Sauce);
                totalPrice += Sauce;
                break;

            case 6:
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
                +"Base burger: " + this.bread + " and " + this.meat+ "\n and some additions.");
        System.out.println("Your Total price is: " +totalPrice);
    }else{
             num++;
             HealthyBurger healthyBurger = new HealthyBurger();
             if (healthyBurger.isFlag() == true){
                 healthyBurger.setTotalPrice(totalPrice);
                 healthyBurger.Selecting();
             }else {
                 Selecting();
             }
    }
  }
}
