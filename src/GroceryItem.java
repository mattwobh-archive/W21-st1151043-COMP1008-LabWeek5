public class GroceryItem {

    private String item;
    private double price;
    private String type;

    public GroceryItem(String item, double price, String type){
        setName(item);
        setPrice(price);
        setCategory(type);
    }

    public String getName() {
        return item;
    }

    public void setName(String item) {
        if(item.length() > 2) {
            this.item = item;
        }else{
            throw new IllegalArgumentException(item + " is not a valid grocery item.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return type;
    }

    public void setCategory(String type) {
        this.type = type;
    }
}
