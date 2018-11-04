package grocerysystem.products;

import java.util.List;

public class NonFoodProduct extends Product {

    private String[] materials;

    public NonFoodProduct(String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }

    @Override
    public String toString() {
        return this.getName() + " Materiale liste: " + materials;
    }

    @Override
    public boolean equals(Object o) {
        NonFoodProduct p;
        if (o instanceof NonFoodProduct) {
            p = (NonFoodProduct) o;
            if (this.getSerial().equals(p.getSerial()) && this.materials.equals(p.materials)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
