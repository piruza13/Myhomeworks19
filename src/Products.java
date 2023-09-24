
public class Products
{
    private String name;
    private String weight;
    private String price;

    public Products(String item_name, String weight,String price)
    {
        this.name = item_name;
        this.weight = weight;
        this.price = price;
    }
    public String get_name()
    {
        return name;
    }
    public String getWeight() {return weight;
    }

    public String getPrice () {
        return price;
    }
}


