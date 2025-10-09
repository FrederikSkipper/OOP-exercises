package exercisFive; 

interface compile<Item> {
    Item sorting();
}


public class Item implements Comparable<Item> {
private String name;
private double price;   

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(
        return name;
    )
    public double getprice(
        return price;
    )
    @Override
    public String <Item> void (name, price) {
        array.sort(Item);
    }
}


/* Complete the Item class by adding the needed constructor to allow for inital values for the name and
price of the item. Also add geters and seters for the two instance variables. Add the required
method, so the class implements the Comparable<Item> interface. The natural order for sor�ng
items is by their names. */