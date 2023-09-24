
public class Products
{
    private String _name;
    private String weight;
    private String price;

    public Products(String item_name, String weight,String price)
    {
        this._name = item_name;
        this.weight = weight;
        this.price = price;
    }
    public String get_name()
    {
        return _name;
    }
    public String getWeight() {return weight;
    }

    public String getPrice () {
        return price;
    }
}


