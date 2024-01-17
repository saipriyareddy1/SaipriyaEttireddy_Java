package loopsconditions;
public class Revdigit {
    public static void main(String args[]) {
        int num = 12345;
        while (num != 0) {
            int x = num % 10;
            System.out.print(x);
            num = num / 10;
        }
    }
}
