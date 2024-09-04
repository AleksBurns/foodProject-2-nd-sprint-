package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    public double totalSummWithoutDiscount() {
        double summ = 0;
        for (Food food : foods) {
            summ = summ + (food.getPrice() * food.getAmount());
        }
        return summ;
    }

    public double totalSummWithDiscount() {
        double summ = totalSummWithoutDiscount();
        for (Food food : foods) {
            if (food.hasDiscount())

                summ = summ - (food.getPrice() * food.getAmount() - (food.getPrice() * food.getAmount()) * ((100 - food.getDiscount()) / 100));
                //summ = summ + ((-food.getDiscount() * food.getPrice() * food.getAmount())/100);
        }
        return summ;
    }
     public double totalSummVegWitoutDiscount() {
        double summ = 0;
        for (Food food : foods) {
            if (food.isVeg())
                summ = summ + (food.getPrice() * food.getAmount());
        }
        return summ;
    }
}
