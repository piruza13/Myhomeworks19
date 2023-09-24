public class Printitems {
    public static void main (String [] args)
    {
        Shoppingcart obj = new Shoppingcart( 214748364);
        Products item = new Products("Milk", "1L", "670 AMD");
        Products item2 = new Products("Bread", "200g", "200AMD");
        Products item3 = new Products("Butter", "100g", "80000AMD");
        Products item4 = new Products("Wine", "1L", "40000AMD");



        obj.addItem(item);
        obj.removeItem(item);
        obj.addItem(item2);
        obj.addItem(item3);
        obj.addItem(item4);
        obj.display();
    }
}
