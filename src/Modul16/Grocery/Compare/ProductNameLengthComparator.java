package Modul16.Grocery.Compare;

import Modul16.Grocery.Products.Product;

import java.util.Comparator;

public class ProductNameLengthComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().length() - o2.getName().length();
    }

}
