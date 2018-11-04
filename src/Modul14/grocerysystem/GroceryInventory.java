package grocerysystem;

import grocerysystem.products.FoodProduct;
import grocerysystem.products.NonFoodProduct;
import grocerysystem.products.Product;
import java.util.Date;

public class GroceryInventory {

    public static void main(String[] args) {
        ProductDatabase inventory = new ProductDatabase();

        FoodProduct p1 = foodProductCreator("Milk", 6.95, -1000000000, 5);
        inventory.addProduct(p1);
        FoodProduct p2 = foodProductCreator("Cream", 12.95, 800000000, 3);
        inventory.addProduct(p2);
        FoodProduct p3 = foodProductCreator("Cake", 18.00, 8000000000L, 20);
        inventory.addProduct(p3);

        NonFoodProduct p4 = new NonFoodProduct("Reol", 295.5, new String[]{"Bøg", "Maling"});
        inventory.addProduct(p4);

        NonFoodProduct p5 = new NonFoodProduct("Stol", 29.5, new String[]{"Plast", "Mere plast"});
        inventory.addProduct(p5);
        
        NonFoodProduct p6 = new NonFoodProduct("Samsung Galaxy S9", 7899.95, new String[]{"Snapdragon something something", "Ram", "Screen"});
        inventory.addProduct(p6);

        System.out.println("Total price: " + inventory.getTotalPrice() + "\n");
        System.out.println(inventory.printInventory());

        //Polymorph loop
        for (Product p : inventory.getProducts()) {
            System.out.println(p.toString());
        }
        
        inventory.removeExpiredFoods();
    }

    private static FoodProduct foodProductCreator(String name, double price, long expOffsetMs, int temp) {
        Date d = new Date();
        d.setTime(d.getTime() + expOffsetMs);
        return new FoodProduct(name, price, d, temp);
    }

}
