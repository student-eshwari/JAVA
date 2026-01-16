import java.util.*;
public class Duplicate {
    public static String removeduplicate(String s) {
        if(s.length() == 0)
            return " ";
        
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)!= s.charAt(i-1)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
}
    public static void main (String [] args) {
        String s = "aabbdd ";
        System.out.println(removeduplicate(s)); 
    }
    
}

// time complexity : O(n)
// space complexity : O(n)
