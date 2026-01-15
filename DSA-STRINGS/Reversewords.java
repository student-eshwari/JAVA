import java.util.*;
public class Reversewords {
    public static String rotate(String s) {
    String[] parts = s.split("\\.");
    StringBuilder sb = new StringBuilder();
    
    for (int i = parts.length-1; i>=0; i--) {
        if(!parts[i].isEmpty()) {
            sb.append(parts[i]).append(".");
        }
    }

    if(sb.length()>0) {
        sb.setLength(sb.length()-1); 
    }
    return sb.toString();
}  

public static void main(String[] args) {
    String s = "...i..like...java";
    System.out.println(rotate(s));
}
}
// time complexity : O(n)
// space complexity : O(n)


