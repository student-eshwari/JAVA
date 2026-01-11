import java.util.*;
public class keyvalue {
    public static void dupliacte(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        freq.put(c,freq.getOrDefault(c, 0) +1);
        }
        for(Map.Entry<Character,Integer>it:freq.entrySet()){
            if(it.getValue() > 1) {
                System.out.println(it.getKey() + ":"  + it.getValue());
            }
        }
        }
        public static void main(String[] args) {
            String s = "COMMITTEE";
            dupliacte(s);
        }
    }
    // time complexity : O(n)
    // space complexity : O(n)
    

