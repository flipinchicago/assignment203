package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseBurger burger1 = new BaseBurger("wheat","chicken",true,true,true,true);

        burger1.BurgerPrice();

        HealthChoice hcburger1 = new HealthChoice("italian", "beef", true,true,true,true, true,true);

        hcburger1.HCPrice();

        DeluxeCombo dcburger1 = new DeluxeCombo(true,burger1);
        dcburger1.DCPrice();
    }
}
