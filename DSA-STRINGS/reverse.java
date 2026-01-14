import java.util.*;
public class reverse {
    public static String solution( String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            res.append(s.charAt(i));
            
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "COMBINATION";
        System.out.println(solution(s));
    }
}
// time complexity : O(n)
// space complexity : O(n)
    
    

