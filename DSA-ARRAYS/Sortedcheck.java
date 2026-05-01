public class Sortedcheck {

    public static  boolean issorted(int[] nums) {

        for(int i = 1; i < nums.length; i++) {
        if(nums[i] < nums[i - 1]){
            return false;
        }
    }
    return true;
        }
        public static void main (String[] args){

            int nums1[] = { 4,6,7,8,9 };
            int nums2[] = { 5,7,3,2,7 };

         System.out.println(issorted(nums1));
         System.out.println(issorted(nums2));
         

        }
    } 
    
/*
  Time: O(n)
  Space: O(1)
  */
