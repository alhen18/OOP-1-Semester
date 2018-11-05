package Modul16.Grocery;

import Modul16.Grocery.Products.ExpiredProductAddedException;
import Modul16.Grocery.Products.FoodProduct;
import Modul16.Grocery.Products.NonFoodProduct;
import Modul16.Grocery.Products.Product;

import java.util.Date;


public class GroceryInventory {

    public static void main(String[] args) {

        ProductDatabase inventory = new ProductDatabase();

        try {
            FoodProduct p1 = foodProductCreator("Milk", 6.90, -1000000000, 5);
            inventory.addProduct(p1);
            FoodProduct p2 = foodProductCreator("Cream", 12.95, 800000000, 3);
            inventory.addProduct(p2);
            FoodProduct p3 = foodProductCreator("Cake", 18.00, 8000000000L, 20);
            inventory.addProduct(p3);
        } catch (ExpiredProductAddedException ex) {
            System.out.println("Attempted to Add Expired product.");
        }

        NonFoodProduct p4 = new NonFoodProduct("Reol", 295.5,
                new String[]{"Bøg", "Maling"});
        inventory.addProduct(p4);

        NonFoodProduct p5 = new NonFoodProduct("Stol", 29.5,
                new String[]{"Plastic", "Mere Plastic"});
        inventory.addProduct(p5);

        NonFoodProduct p6 = new NonFoodProduct("Samsung Galaxy S9", 7899.95,
                new String[]{"Snapdragon something something", "Ram", "Screen"});
        inventory.addProduct(p6);

        System.out.println("\n" + "Total price: " + inventory.getTotalPrice() + "\n");

        inventory.removeExpiredFoods();

        System.out.println("\n" + "After removing the expired items: ");
        System.out.println(inventory.printInventory());

        System.out.println("\n" + "Here is the products sorted by names length:");
        for (Product p : inventory.sortedByNameLength()) {
            System.out.println(p);
        }

        System.out.println("\n" + "Here is the products sorted by price:");
        for (Product p : inventory.sortedByPrice()) {
            System.out.println(p);
        }
    }

    private static FoodProduct foodProductCreator(String name, double price, long expOffsetMs, int temp)
            throws ExpiredProductAddedException {
        Date d = new Date();
        d.setTime(d.getTime() + expOffsetMs);
        return new FoodProduct(name, price, d, temp);
    }

}
