class Staticclass {
    static int statvar=5;
    public static int methodStatic(){
        return statvar;
    }
}
final class Finalclass{
    private final int finalval;
    //invoking constructor to initialize finalval variable
    public Finalclass(int finalval) {
        this.finalval = finalval;
    }
    //final method
    final int finalMethod(){
        return 1;
    }
}
class Parent{
    int x;
    //parameterized constructor for class Parent
    public Parent(int x) {
        this.x = x;
    }
    //default constructor
    public Parent(){

    }
}
class Child extends Parent{
    int y;
    //parameterized constructor invoking class Parent and Child
    public Child(int y, int x) {
        super(x); //to invoke parent class constructor
        this.y = y;
    }
    //Overloaded constructor for child class
    public Child(int y) {
        this.y = y;
    }
}
class Constructorstaticfinal{
    public static void main(String args[]){
        //Finalclass instance
        Finalclass finalinstance = new Finalclass(15);
        System.out.println("Final Variable:" +finalinstance.finalMethod());

        //Accessing static class variable
        System.out.println("Static Variable:" +Staticclass.statvar);

        //instance variable for child class constructor and overloaded constructor
        Child instance1 = new Child(10,20);
        Child instance2 = new Child(30);
        System.out.println("Parent variable child instance1:" + instance1.x);
        System.out.println("child variable child instance1:" + instance1.y);

        System.out.println("Parent variable child instance2:" + instance2.x);
        System.out.println("child variable child instance2:" + instance2.y);


    }
}
