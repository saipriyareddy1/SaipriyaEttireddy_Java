package loopsconditions;
public class Fibonocci {
    public static void main(String args[]) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < (n - 2); i++) {
             int sum=a+b;
             System.out.print(sum+ " ");
             a=b;
             b=sum;
        }
    }
}
