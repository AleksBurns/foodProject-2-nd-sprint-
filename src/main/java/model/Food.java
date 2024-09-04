package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {

        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    public double getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }

    public boolean hasDiscount() {
        return getDiscount() != Discount.DEFAULT_DISCOUNT;
    }

    public boolean isVeg() {
        return isVegetarian;
    }
}
