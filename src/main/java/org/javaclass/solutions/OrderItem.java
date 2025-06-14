package org.javaclass.solutions;

//!                             Declare the appropriate accessors, mutators,
//!                             and constructors for this class.
class OrderItem {
    String itemName;
    boolean inStock;
    double price;
    int quantity;
    long itemNumber;

    public OrderItem() {
    }

    public OrderItem(String itemName, boolean inStock, double price, int quantity, long itemNumber) {
        this.itemName = itemName;
        this.inStock = inStock;
        this.price = price;
        this.quantity = quantity;
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemName='" + itemName + '\'' +
                ", inStock=" + inStock +
                ", price=" + price +
                ", quantity=" + quantity +
                ", itemNumber=" + itemNumber +
                '}';
    }
}
