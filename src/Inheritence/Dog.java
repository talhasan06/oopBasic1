package Inheritence;
//extends -> inherite
public class Dog extends Animal{
    public void eat(){
        System.out.println("dog can eat"); //method overriding
        super.eat();
    }

    public void sleep(){
        System.out.println("dog can sleep");
    }
    //defualt constructor
    public void Dog(){

    }
}
