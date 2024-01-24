package arrays;

public class Largesmall {
    public static void main(String args[]){
       int a[] = {1,5,2,6,3};
       int l=a[0],s=a[0];
       for(int i=0;i<a.length;i++){
           if(l<=a[i])
               l=a[i];
           if(s>=a[i])
               s=a[i];
       }
       System.out.println("Largest:"+l);
       System.out.println("Smallest:"+s);
    }
}
