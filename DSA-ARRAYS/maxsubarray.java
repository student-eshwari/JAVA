import java.util.*;
public class maxsubarray {
    public static int sum(int [] arr) {
        int i = 0;
        int sum = 0;
        int maxsum = 0;
        while (i < arr.length) {
            sum += arr[i];
            if(sum > maxsum) {
                maxsum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
            i++;
}
return maxsum;
    }
    public static void main(String[] args) {
        int [] arr = { 4,-5,7,8,9};
        System.out.println(sum(arr));
    }
}
// time complexity : O(n)
// space complexity : O(n)





 /*  code for sum of subarray and subarray
 import java.util.*;
 public class maxsubarray {
    public static int sum(int [] arr) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = 0; final subarray start
        int end = 0;   final subarray end
        int tempstart = 0; temp start index
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            update maximum sum and subarray indices
            if(sum > maxsum) {
                maxsum = sum;
                start = tempstart;
                end = i;
            }
                reset if sum becomes negative
            if(sum < 0) {
                sum = 0;
                tempstart = i+1;
}
}
printing results
system.out.println("maximum subarray sum ="+ maxsum);
system.out.print("subsarray = ");
for (int i = start; i <= end; i++) {
sytem.out.print(arr[i] ="");
}
}
public static void main (String[] args) {
int [] arr = {2,-6,8,9};
system.out.print(sum(arr))
}
*/
