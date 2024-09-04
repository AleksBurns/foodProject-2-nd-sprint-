package praktikum;

import model.Apple;
import model.Discountable;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import service.ShoppingCart;



public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple red = new Apple(10, 50, Colour.RED);
        Apple green = new Apple(8,60, Colour.GREEN);
        Food[] foods = new Food[] {meat, red, green};
       ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров в корзине без скидки: " + shoppingCart.totalSummWithoutDiscount());
        System.out.println("Общая сумма товаров в корзине со скидкой: " + shoppingCart.totalSummWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + shoppingCart.totalSummVegWitoutDiscount());
    }
}