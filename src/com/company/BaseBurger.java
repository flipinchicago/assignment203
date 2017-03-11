package com.company;

/**
 * Created by Frenz on 3/10/2017.
 */
public class BaseBurger {
    private String mBreadRollType;
    private String mMeat;
    private boolean mLettuce, mTomato, mCarrot, mCheese;

    public BaseBurger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        mBreadRollType = breadRollType;
        mMeat = meat;
        mLettuce = lettuce;
        mTomato = tomato;
        mCarrot = carrot;
        mCheese = cheese;
    }

    public void BurgerPrice (){
        double meat = 5.00;

        if (mLettuce && mCarrot && mTomato && mCheese)
            System.out.println("Burger price is $" + String.format("%.2f", (meat+ 2.00)));
        else if (mLettuce && mCarrot && mTomato && (!mCheese))
            System.out.println("Burger price is $" + String.format("%.2f", (meat+ 1.50)));
        else if (mLettuce && mCarrot && (!mTomato) && (!mCheese))
            System.out.println("Burger price is $" + String.format("%.2f", (meat+ 1.00)));
        else if (mLettuce && (!mCarrot) && (!mTomato) && (!mCheese))
            System.out.println("Burger price is $" + String.format("%.2f", (meat+ 0.50)));
        else System.out.println("Burger price is $" + String.format("%.2f", meat));

    }

    public String getBreadRollType() {
        return mBreadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        mBreadRollType = breadRollType;
    }

    public String getMeat() {
        return mMeat;
    }

    public void setMeat(String meat) {
        mMeat = meat;
    }

    public boolean isLettuce() {
        return mLettuce;
    }

    public void setLettuce(boolean lettuce) {
        mLettuce = lettuce;
    }

    public boolean isTomato() {
        return mTomato;
    }

    public void setTomato(boolean tomato) {
        mTomato = tomato;
    }

    public boolean isCarrot() {
        return mCarrot;
    }

    public void setCarrot(boolean carrot) {
        mCarrot = carrot;
    }

    public boolean isCheese() {
        return mCheese;
    }

    public void setCheese(boolean cheese) {
        mCheese = cheese;
    }
}


