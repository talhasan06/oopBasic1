public class Product {
    String name;
    int price;
    int amount;

    public void ProductEntry(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void ProductEntry(String name,int price,int amount){
        this.name=name;
        this.price=price;
        this.amount=amount;
    }
}
