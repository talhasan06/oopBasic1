public class Product {
    String name;
    int price;
    int quantity;

    //method overloading
    public void ProductEntry(String name,int price){
        this.name=name;
        this.price=price;
    }
    //method overloading
    public void ProductEntry(String name,int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
