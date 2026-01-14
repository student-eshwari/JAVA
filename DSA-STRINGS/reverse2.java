import java.util.*;
public class reverse2 {
    public static String character( String s) {
        int left = 0, right = s.length()-1;
        StringBuilder res = new StringBuilder(s);
        while (left<right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right,temp);
            left++;
            right--;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "WINDOW";
        System.out.println(character(s));
    }
}
// time complexity : O(n)
// space complexity : O(n)
