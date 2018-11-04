package grocerysystem.products;

import grocerysystem.products.interfaces.Expireable;
import java.util.UUID;

public abstract class Product implements Expireable
{
    private UUID serial;
    private String name;
    private double price;
    
    public Product(String name, double price)
    {
        this.serial = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public UUID getSerial()
    {
        return serial;
    }
    
    @Override
    public boolean isExpired()
    {
        throw new UnsupportedOperationException("Product does not support this operation.");
    }
}
