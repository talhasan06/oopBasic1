public class Vehicle {
    String name;
    String model;
    int year;
    int price;
    //contructor
    public Vehicle(String name,String model,int year,int price){
        this.name=name;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public void displaySomething(){
        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);
    }
    public static void method1(){

        System.out.println("Hello World");
    }

}
