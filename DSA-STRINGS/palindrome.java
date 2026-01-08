import java.util.*;
public class palindrome {
public static boolean ispalindrome(String s){
     s = s.toLowerCase().replaceAll("[^a-z0-9]","");
     int left = 0;
     int right = s.length() - 1;
      
     while(left<right)  {
        if (s.charAt(left) != s.charAt(right)) {
          return false;
 }
        left ++;
        right--;
}
     return true;
}
public static void main (String[] args){
  String s = "^plane";
    System.out.println(ispalindrome(s));
}
}
// time comlexity : O(n)
// space complexity : O(n)