public class Printitems {
    public static void main (String [] args)
    {
        Shoppingcart obj = new Shoppingcart(2);
        Products item = new Products("Milk");
        Products item2 = new Products("Bread");
        Products item3 = new Products("Butter");

//        System.out.println(item.get_name());
        obj.addItem(item);
        obj.removeItem(item);
        obj.addItem(item2);
        obj.addItem(item3);
//        obj.addItem(item);
        obj.display();
    }
}
