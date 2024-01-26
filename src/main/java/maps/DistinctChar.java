package maps;

import sun.jvm.hotspot.debugger.win32.coff.DebugVC50SSSrcLnSeg;

import java.util.HashMap;

public class DistinctChar {
    public static void differentOccur(String str){
        HashMap<Character,Integer> charcount = new HashMap<>();
        char[] ch = str.toCharArray();
        for(Character letter:ch){
            if(charcount.containsKey(letter))
                charcount.put(letter,charcount.get(letter)+1);
            else
                charcount.put(letter,1);
        }
    }
}
