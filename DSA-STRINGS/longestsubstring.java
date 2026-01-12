import java.util.*;
public class longestsubstring {
    public static int solution( String s) {

        HashSet < Character> set = new HashSet<>();
        int left = 0;
        int maxlen = 0;

        for(int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "bbaacc";
        System.out.println(solution(s));
    }
    
}
// time complexity : O(n)
// space complexity : O(1)
