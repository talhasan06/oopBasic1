import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Vehicle c1=new Vehicle("Audi","R8",2018,45000);
        Vehicle c2=new Vehicle("Toyota","XCorola",2022,25000);

        c1.displaySomething();
        System.out.println("---------------");
        c2.displaySomething();
        System.out.println("---------------");

        Vehicle.method1();

        Product p1=new Product();
        p1.ProductEntry("phone",5000,12);
        p1.ProductEntry("laptop",20000);

//        int a=10;
//        double b=5.6;
//        char ch='a';
//
//        String s="John";
//        String r="David";
//
//        System.out.println(a+" "+b+" "+ch);
//
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//
//        if(s.equals(r)){
//            System.out.println("matched");
//        }else{
//            System.out.println("not matched");
//        }

    }
}