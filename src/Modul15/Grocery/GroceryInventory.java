package Modul15.Grocery;

import Modul15.Grocery.Products.ExpiredProductAddedException;
import Modul15.Grocery.Products.FoodProduct;
import Modul15.Grocery.Products.NonFoodProduct;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GroceryInventory {

    public static void main(String[] args) {

        try {
            ProductDatabase inventory = new ProductDatabase();

            FoodProduct p1 = foodProductCreator("Milk", 6.95, -1000000000, 5);
            inventory.addProduct(p1);
            FoodProduct p2 = foodProductCreator("Cream", 12.95, 800000000, 3);
            inventory.addProduct(p2);
            FoodProduct p3 = foodProductCreator("Cake", 18.00, 8000000000L, 20);
            inventory.addProduct(p3);

            NonFoodProduct p4 = new NonFoodProduct("Reol", 295.5,
                    new String[]{"Book", "Panting"});
            inventory.addProduct(p4);

            NonFoodProduct p5 = new NonFoodProduct("Stol", 29.5,
                    new String[]{"Plastic", "Mere Plastic"});
            inventory.addProduct(p5);

            NonFoodProduct p6 = new NonFoodProduct("Samsung Galaxy S9", 7899.95,
                    new String[]{"Snapdragon something something", "Ram", "Screen"});
            inventory.addProduct(p6);

            System.out.println("\n" + "Total price: " + inventory.getTotalPrice()
                    + "\n");
            System.out.println(inventory.printInventory());

            //Polymorph loop
            inventory.getProducts().forEach((p) -> {
                System.out.println(p.toString());
            });

            inventory.removeExpiredFoods();

            System.out.println("\n" + "After removeing the expired items: ");
            System.out.println(inventory.printInventory());

        } catch (ExpiredProductAddedException ex) {
            Logger.getLogger(GroceryInventory.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    private static FoodProduct foodProductCreator(String name, double price, long expOffsetMs, int temp)
            throws ExpiredProductAddedException {
        Date d = new Date();
        d.setTime(d.getTime() + expOffsetMs);
        return new FoodProduct(name, price, d, temp);
    }

}
