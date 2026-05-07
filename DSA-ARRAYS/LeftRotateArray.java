public class LeftRotateArray {

    public static void rotateleft(int[] nums) {

        int first = nums[0];

        for(int i = 0; i < nums.length-1; i++) {
            
            nums[i] = nums[i + 1];
        }

        nums[nums.length-1] = first;
        
    }

    public static void main(String[] args) {

        int nums[] = {1,3,5,7,9};
        
        rotateleft(nums);
        
        for(int i = 0; i < nums.length; i++) {
        
        System.out.print(nums[i] + " ");
    }
    
}
    
}


/* Time Complexity : O(n)
   Space Complexity : O(1) */
