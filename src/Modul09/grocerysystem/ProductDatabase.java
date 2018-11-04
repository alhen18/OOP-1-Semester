package grocerysystem;

import java.text.DecimalFormat;
import java.util.UUID;
import grocerysystem.products.Product;

public class ProductDatabase {

    private Product[] products;
    private int productCount;

    public ProductDatabase() {
        this.products = new Product[100];
        this.productCount = 0;
    }

    public void addProduct(Product p) {

        //Check to make sure that we have not reached final index
        if (productCount < products.length) {
            products[productCount] = p;
            productCount++;
        }
        else
        {
            //No more capacity in array. Extend it.
            extendArray();
            //Recursively add element.
            addProduct(p);
        }
    }

    public void removeProduct(UUID serial) {
        //Loop through filled inventory spaces
        for (int i = 0; i < productCount; i++) {
            //Compare @serial with serial for product at current inventory space.
            if (products[i].getSerial() == serial) {
                //If id's are equal, remove element by shifting all other elements one place down in the inventory.
                shiftInventoryFromIndex(i);
                //We found the product - break out of the loop.
                break;
            }
        }
    }

    private void shiftInventoryFromIndex(int i) {
        //Override spot @i in inventory, but moving everything beyond this point one place down in the inventory.
        for (int j = i; j < productCount; j++) {
            products[j] = products[j + 1];
        }
    }

    public String printInventory() {
        //Use StringBuild to create a combined string from multiple strings.
        StringBuilder sb = new StringBuilder();
        //Append adds String to the end of the combined string.
        sb.append("Lagerbeholdning:\n");

        for (int i = 0; i < productCount; i++) {
            Product p = products[i];
            sb.append("Name: ").append(p.getName()).append("\t")
                    .append("Price: ").append(p.getPrice()).append("\t")
                    .append("Serial: ").append(p.getSerial()).append("\n");
        }
        //Call toString on the StringBuilder object, to get the String representation.
        return sb.toString();
    }

    public String getTotalPrice() {
        double result = 0;
        //Loop through all products. Accumulate prices.
        for (int i = 0; i < productCount; i++) {
            Product p = products[i];
            result += p.getPrice();
        }
        //Use DecimalFormat class to get a currency representation of the double in local currency.
        return DecimalFormat.getCurrencyInstance().format(result);
    }

    private void extendArray() {
        //Create a new array with 10 additional spots.
        Product[] tempArray = new Product[products.length + 10];
        for(int i = 0; i < products.length; i++)
        {
            tempArray[i] = products[i];
        }
        products = tempArray;
    }
}
