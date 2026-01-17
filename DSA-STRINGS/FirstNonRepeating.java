import java.util.*;
public class FirstNonRepeating {
    public static char  EnglishLetters(String s) {
        int [] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
         }

        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)-'a'] ==1) {
                return s.charAt(i);
            }
        }
        return '$';
        }
        public static void main(String[] args) {
            String s = "madam";
            System.out.println(EnglishLetters(s));
        }
    }
    /* time complexity : O(n)
       space complexity : O(1) */
    

