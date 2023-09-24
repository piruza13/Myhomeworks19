
public class Shoppingcart
{
    private Products[] cart;
    private int itemCount;


    public Shoppingcart(int capacity)
    {
        cart = new Products[capacity];
        itemCount = 0;
    }
    public void addItem(Products item) {
        cart[itemCount] = item;
        itemCount ++;
    }

    public void removeItem(Products item)
    {
        cart[itemCount] = null;
        itemCount--;
    }

    public void display()
    {   int i;
        for ( i = 0; i < itemCount; i++)


            System.out.println("Product Name: "  + cart[i].get_name() + "  Weight: " + cart[i].getWeight() + "  Price:  " + cart[i].getPrice());

    }
}
