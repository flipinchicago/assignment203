package com.company;

/**
 * Created by Frenz on 3/10/2017.
 */
public class DeluxeCombo {
    private boolean mCombo;
    private BaseBurger mBaseBurger;

    public DeluxeCombo(boolean combo, BaseBurger baseBurger) {
        mCombo = combo;
        mBaseBurger = baseBurger;
    }

    public void DCPrice(){
        double comboPrice = 8.00; //5 for meat and 3 for combo


        if (mBaseBurger.isLettuce() && mBaseBurger.isCarrot() && mBaseBurger.isTomato() && mBaseBurger.isCheese())
            System.out.println("Combo Burger price is $" + String.format("%.2f", (comboPrice + 2.00)));
        else if (mBaseBurger.isLettuce() && mBaseBurger.isCarrot() && mBaseBurger.isTomato() && !mBaseBurger.isCheese())
            System.out.println("Combo Burger price is $" + String.format("%.2f", (comboPrice + 1.50)));
        else if (mBaseBurger.isLettuce() && mBaseBurger.isCarrot() && !mBaseBurger.isTomato() && !mBaseBurger.isCheese())
            System.out.println("Combo Burger price is $" + String.format("%.2f", (comboPrice + 1.00)));
        else if (mBaseBurger.isLettuce() && !mBaseBurger.isCarrot() && !mBaseBurger.isTomato() && !mBaseBurger.isCheese())
            System.out.println("Combo Burger price is $" + String.format("%.2f", (comboPrice + .50)));
        else System.out.println("Combo Burger price is $" + String.format("%.2f", comboPrice));
    }
}
