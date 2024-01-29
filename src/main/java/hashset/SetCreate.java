package hashset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetCreate {
    //using for loop
//     public void readElements(HashSet<String> hset){
//         String[] elements = {"a","b","c","d","e","f","g","h","j","i"};
//         hset.addAll(Arrays.asList(elements));
//     }
//     public Iterator<String> iterateFun(HashSet<String> hset){
    public Iterator<String> iterateFun(HashSet<String> hset){
//        HashSet<String> hset = new HashSet<>();
//        readElements(hset);
        Iterator<String> iterate = hset.iterator();
        while(iterate.hasNext()){
              iterate.next();
              //return iterate;
        }
        return hset.iterator();
    }
    public String[] iterateUsingForLoop(HashSet<String> hset){
//        HashSet<String> hset = new HashSet<>();
//        readElements(hset);
        String[] arrele = hset.toArray(new String[0]);
        for (int i = 0; i < arrele.length; i++)
              return arrele;
        return new String[0];
    }
    public String[] iterateUsingEnhancedForLoop( HashSet<String> hset){
//        HashSet<String> hset = new HashSet<>();
//        readElements(hset);
        for(String val:hset)
            return new String[]{val};
        return new String[0];
    }

//    public static void main(String args[]){
//         SetCreate sc = new SetCreate();
//         //HashSet<String> hs = new HashSet<>();
//         System.out.println(sc.iterateFun());
//         System.out.println(sc.iterateValues());
//    }


}
