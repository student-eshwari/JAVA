import java.util.*;
public class twicenums {
    public static boolean duplicate(int[] nums ) {
        Arrays.sort(nums);
       
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
            return false;
       
        }
        public static void main(String[] args) {
         int[] nums = {2,3,5,6,4,};
         System.out.println(duplicate(nums));
        }
    }
       
        

