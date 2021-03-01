import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> itemArray = new ArrayList<>();
    private double totalPrice;
    public void addGroceryItem(GroceryItem item){
        itemArray.add(item);
    }
    public double getTotalPrice(){
        totalPrice = 0;
        for(int i = 0; i < itemArray.size(); i++) {
            totalPrice += itemArray.get(i).getPrice();
        }
        return totalPrice;
    }
    public String getGroceryNames(){
        String names = "";
        for(int i = 0; i < itemArray.size(); i++) {
            names += itemArray.get(i).getName() + ", ";
        }
        return names;
    }
    public String getCategories(){
        String categories = "";
        for(int i = 0; i < itemArray.size(); i++) {
            categories += itemArray.get(i).getCategory() + ", ";
        }
        return categories;
    }
    public String toString(){
        return "The grocery list has " + itemArray.size() + " with a total cost of $" + (double)Math.round(totalPrice*100)/100 + ".";
    }
}
