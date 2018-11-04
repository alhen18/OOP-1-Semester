package Modul09.grocerysystem.products;

import java.util.Calendar;

public class FoodProduct extends Product
{
    private Calendar expireDate;
    private int storeTemp;

    public FoodProduct(String name, double price, Calendar expireDate, int storeTemp)
    {
        super(name, price);
        this.expireDate = expireDate;
        this.storeTemp = storeTemp;
    }

    public int getStoreTemp()
    {
        return storeTemp;
    }

    public Calendar getExpireDate()
    {
        return expireDate;
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " Udløber:" + expireDate;
    }
}
