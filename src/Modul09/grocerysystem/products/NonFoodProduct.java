package Modul09.grocerysystem.products;

public class NonFoodProduct extends Product
{
    private String[] materials;
    
    public NonFoodProduct(String name, double price, String[] materials)
    {
        super(name, price);
        this.materials = materials;
    }
    
    @Override
    public String toString()
    {
        return this.getName() +" Materiale liste: " +  materials;
    }
}
