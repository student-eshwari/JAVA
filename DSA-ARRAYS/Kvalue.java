import java.util.*;
public class Kvalue {
    public static int smallest(int[] arr, int k ) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {3,6,4,7,8,9,2,19,17};
        int k = 4;
        System.out.println(smallest(arr, k));
    }
    
}
// time complexity : O(n log n)
// space cmplexity : O(1)