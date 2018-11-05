package Modul16.Grocery;

import Modul16.Grocery.Compare.ProductNameLengthComparator;
import Modul16.Grocery.Products.Product;
import java.text.DecimalFormat;
import java.util.*;

public class ProductDatabase {

    private final Map<UUID, Product> products = new HashMap<>();

    public ProductDatabase() {
    }

    public void addProduct(Product p) {
        products.put(UUID.randomUUID(), p);
    }

    public void removeProductByNumber(UUID serial) {
        for (Map.Entry<UUID, Product> p : products.entrySet()) {
            if (p.getValue().equals(serial)) {
                products.remove(p);
            }
        }
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public String printInventory() {
        //Use StringBuild to create a combined string from multiple strings.
        StringBuilder sb = new StringBuilder();
        //Append adds String to the end of the combined string.
        sb.append("Lagerbeholdning:\n");

        for (Map.Entry<UUID, Product> p : this.products.entrySet()) {
            sb.append("Name: ").append(p.getValue()).append("\t")
                    .append("Price: ").append(p.getValue().getPrice()).append("\t")
                    .append("Serial: ").append(p.getKey()).append("\n");
        }
        //Call toString on the StringBuilder object, to get the String representation.
        return sb.toString();

    }

    public String getTotalPrice() {
        double result = 0;
        //Loop through all products. Accumulate prices.
        for (Product p : this.products.values()) {
            result += p.getPrice();
        }
        //Use DecimalFormat class to get a currency representation of the double in local currency.
        return DecimalFormat.getCurrencyInstance().format(result);

    }

    public Map<UUID, Product> getProducts() {
        //Return a copy of the array, so that the database is not exposed to external actors.
        return new HashMap<>(this.products);
    }

    public void removeExpiredFoods() {
        ArrayList<UUID> expiredProducts = new ArrayList<>();
        for (Map.Entry<UUID, Product> p : this.products.entrySet()) {
            try {
                if (p.getValue().isExpired()) {
                    // can do products.remove(p) as we are iterating the list. Save for later.
                    expiredProducts.add(p.getKey());
                }
            } catch (UnsupportedOperationException ex) {
                //Encountered a NonFoodProduct-object. Nothing to worry about.
            }
        }
        System.out.println("Removing a total of " + expiredProducts.size() + " expired product(s)");
        for(UUID expiredProduct : expiredProducts)
            products.remove(expiredProduct);
    }

    public List<Product> sortedByNameLength() {
        List<Product> data = new ArrayList<>(products.values());
        Comparator<Product> comp = new ProductNameLengthComparator();
        Collections.sort(data, comp);
        return data;
    }

    public List<Product> sortedByPrice() {
        List<Product> data = new ArrayList<>(products.values());
        Collections.sort(data);
        return data;
    }
}