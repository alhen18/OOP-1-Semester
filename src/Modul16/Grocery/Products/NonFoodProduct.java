package Modul16.Grocery.Products;

import java.util.Arrays;

public class NonFoodProduct extends Product {

    private final String[] materials;

    public NonFoodProduct(String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }

    @Override
    public String toString() {
        return this.getName() + " Materiale liste: " + Arrays.toString(this.materials);
    }

    @Override
    public boolean equals(Object o) {
        NonFoodProduct p;
        if (o instanceof NonFoodProduct) {
            p = (NonFoodProduct) o;
            return this.getSerial().equals(p.getSerial()) && Arrays.equals(this.materials, p.materials);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Arrays.deepHashCode(this.materials);
        return hash;
    }
}
