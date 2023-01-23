import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Vehicle c1=new Vehicle("Audi","R8",2018,45000);
        Vehicle c2=new Vehicle("Toyota","XCorola",2022,25000);

        c1.display();
        System.out.println("---------------");
        c2.display();
        System.out.println("---------------");
        Vehicle.helloBye();

//        int a=10;
//        double b=5.6;
//        char ch='a';
//
//        String s="John";
//        String r="David";

//        System.out.println(a+" "+b+" "+ch);

//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());

//        if(s.equals(r)){
//            System.out.println("matched");
//        }else{
//            System.out.println("not matched");
//        }
    }
}