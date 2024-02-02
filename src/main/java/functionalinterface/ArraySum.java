package functionalinterface;

import java.util.ArrayList;

public class ArraySum {
    public int arraySum(int[] arr){
        int sum=0;
        if(arr == null)
            return sum;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        ArraySum a = new ArraySum();
        int[] arr = {1,2,3,4,5};
        System.out.println(a.arraySum(arr));
    }
}
