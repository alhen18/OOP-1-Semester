package Modul15.Grocery.Products;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Aleksander Henriksen
 */
public class FoodProduct extends Product {

    private final Date expireDate;
    private final int storeTemp;

    /**
     *
     * @param name
     * @param price
     * @param expireDate
     * @param storeTemp
     * @throws ExpiredProductAddedException
     */
    public FoodProduct(String name, double price, Date expireDate, int storeTemp)
            throws ExpiredProductAddedException {
        super(name, price);
        this.expireDate = expireDate;
        this.storeTemp = storeTemp;
    }

    /**
     * @return
     */
    public int getStoreTemp() {
        return storeTemp;
    }

    /**
     * @return
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return this.getName() + " Udløber:" + expireDate;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        FoodProduct p;
        if (o instanceof FoodProduct) {
            p = (FoodProduct) o;
            return this.getSerial().equals(p.getSerial())
                    && this.expireDate.equals(p.expireDate);
        }
        return false;
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.expireDate);
        return hash;
    }

    /**
     * @return
     */
    @Override
    public boolean isExpired() {
        Date now = new Date();

        return now.after(expireDate);
    }

}
