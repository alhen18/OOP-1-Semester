package Modul16.Grocery.Products;

/**
 *
 * @author Aleksander Henriksen
 */
public class ExpiredProductAddedException extends Exception {

    public ExpiredProductAddedException() {
        System.out.println("Attempted to add expired product to database");
    }

}