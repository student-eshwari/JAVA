import java.util.*;
public class Threesum {
    public static List<List<Integer>>sum( int[] nums) {
        List <List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
       
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) 
                continue;
        
        int j = i + 1;
        int k = nums.length-1;

        while(j < k) {
          int total = nums[i] + nums[j] + nums[k];
          if(total > 0) {
            k--;
        } else if (total < 0) {
            j++;
        } else {
            res.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
        }
    }

}   
        return res;
}
    public static void main(String[] args) {
           int [] nums = {-1,0,1,2,-1,4};
           System.out.println(sum(nums)); 
        }
    }

    
    

