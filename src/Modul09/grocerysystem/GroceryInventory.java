package grocerysystem;

import grocerysystem.products.Product;

public class GroceryInventory
{
    public static void main(String[] args)
    {
        ProductDatabase inventory = new ProductDatabase();
        
        inventory.addProduct(new Product("Milk", 6.95));
        inventory.addProduct(new Product("Cream", 12.95));
        inventory.addProduct(new Product("Honey", 17.50));
        inventory.addProduct(new Product("Corn", 8.95));
        inventory.addProduct(new Product("Salad", 3.25));
        inventory.addProduct(new Product("Liquorice", 25.95));
        
        System.out.println("Total price: " + inventory.getTotalPrice() + "\n");
        System.out.println(inventory.printInventory());
    }    
}
