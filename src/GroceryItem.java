public class GroceryItem {

    private String item;
    private double price;
    private String type;


    public GroceryItem(String item, double price, String type){
        setName(item);
        setPrice(price);
        setCategory(type);
        toString();
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
        if (price >= 0 && price <= 150) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("$" + price + " is not a valid price. All items in" +
                    "the store are between 0 dollars and 150 dollars.");
        }
    }

    public String getCategory() {
        return type;
    }

    public void setCategory(String type) {
        if(type.toLowerCase() == "vegetable" || type.toLowerCase() == "fruit" ||
                type.toLowerCase() == "meat" || type.toLowerCase() == "dairy" ||
                type.toLowerCase() == "bread" || type.toLowerCase() == "fish" ||
                type.toLowerCase() == "condiments") {
            this.type = type;
        }else{
            throw new IllegalArgumentException(type + " is not a valid category of grocery. " +
                    "The categories are vegetable, fruit, meat, fish, bread, dairy and condiments.");
        }
    }
    public String toString(){
        return item + ", Category: " + type + ", Price: $" + price;
    }
}
