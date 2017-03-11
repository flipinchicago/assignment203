package com.company;

/**
 * Created by Frenz on 3/10/2017.
 */
public class HealthChoice extends BaseBurger {

    private boolean mAddItem1;
    private boolean mAddItem2;

    public HealthChoice(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese, boolean addItem1, boolean addItem2) {
        super(breadRollType, meat, lettuce, tomato, carrot, cheese);
        mAddItem1 = addItem1;
        mAddItem2 = addItem2;
    }

    public void HCPrice () {
        double meat = 5.00;


        if (isLettuce() && isCarrot() && isTomato() && isCheese() && mAddItem1 && mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 3.00)));
        else if (isLettuce() && isCarrot() && isTomato() && isCheese() && mAddItem1 && !mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 2.50)));
        else if (isLettuce() && isCarrot() && isTomato() && isCheese() && !mAddItem1 && !mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 2.00)));
        else if (isLettuce() && isCarrot() && isTomato() && !isCheese() && !mAddItem1 && !mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 1.50)));
        else if (isLettuce() && isCarrot() && !isTomato() && !isCheese() && !mAddItem1 && !mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 1.00)));
        else if (isLettuce() && !isCarrot() && !isTomato() && !isCheese() && !mAddItem1 && !mAddItem2)
            System.out.println("Health Choice Burger price is $" + String.format("%.2f", (meat + 0.50)));
        else System.out.println("Health Choice Burger price is $" + String.format("%.2f", meat));
    }
}

