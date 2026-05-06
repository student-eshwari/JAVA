class Solution {

    public static int removeDuplicates(int [] nums) {

        if(nums.length == 0)
            return 0;
        
        int i = 0;

        for(int j = 1; j < nums.length; j++) {

        if(nums[i] != nums[j]) {

        i++;

        nums[i] = nums[j];
           
    }

}
         return i+1;
    
    
}
    public static void main(String[] args) {

        int [] nums = {1,2,2,2,1,4,5,6,7,6,3};

        int newlength = removeDuplicates(nums);

        for(int i = 0; i < newlength; i++) {

        System.out.println("sorted:" + removeDuplicates(nums));
    }
}
}

/* Time Complexity : O(n)
   Space Complexity: O(1) */

