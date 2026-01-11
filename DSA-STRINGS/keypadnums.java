import java.util.*;
public class keypadnums {
    public static String numeric (String arr[], String input) {
        StringBuilder output = new StringBuilder();
        
        for( int i =  0; i<input.length(); i++) {
            if(input.charAt(i) == ' ') {
            output.append('0');
            } else {
                int position = input.charAt(i) - 'A';
                output.append(arr[position]);
            }
        }
        return output.toString();
 }
    public static void main(String[] args) {
        String arr[] = {"2","22","222","3","33","333",
                        "4","44","444","5","55","555","6","66","666",
                        "7","77","777","7777","8","88","888",
                        "9","99","999","9999"};
        String input = "AKUU";
        System.out.println(numeric(arr, input));
    }
}
// time complexity : O(n)
// space complexity : O(1)