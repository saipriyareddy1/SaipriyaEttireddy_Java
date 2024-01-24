//Parent Class
package OOPS;
class Add{
    public int mathFun(int a, int b){
        int sum = a+b;
        return sum;
    }
}
//Child class
class Multiply extends Add {
    //Overridden Method
    public int mathFun(int a, int b){
        int mul = a*b;
        return mul;
    }
}
class Subtract extends Add {
    //Overridden Method
    public int mathFun(int a, int b){
        int sub = a-b;
        return sub;
    }
}
public class Poly {
    public static void main(String args[]){
        Add obj1 = new Multiply();
        Add obj2 = new Subtract();
        System.out.println(obj1.mathFun(6,4));
        System.out.println(obj2.mathFun(6,4));
    }
}
