package arrays;

public class LinearSearch {
    public static int linearSearch(int a[],int element){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==element)
                return i;
        }
        return 0;

    }
    public static void main(String args[]) {
        int a[] = {1, 3, 6, 8, 10, 50};
        int element = 10;
        System.out.println(element+" is found at index: "+linearSearch(a, element));
    }
}
