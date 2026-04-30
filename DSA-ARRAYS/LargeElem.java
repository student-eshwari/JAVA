public class LargeElem{
    public static int findmax(int[] nums) {
        int max = nums[0];
        for(int i = 0; i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];

        }
    }
    return max;
}
    public static void main(String[] args) {
        int nums[] = {3,5,7,8,9,6};
        System.out.println("Largest Element is : " + findmax(nums));
        
    }


    }
