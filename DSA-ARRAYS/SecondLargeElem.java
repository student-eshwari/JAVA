public class SecondLargeElem{
    public static int findsecondlarge(int[] nums){
     if(nums == null || nums.length < 2 ){
        return -1;
     }
     int largest = Integer.MIN_VALUE;
     int secondlargest = Integer.MIN_VALUE;
     for(int i = 0; i < nums.length; i++) {
        if(nums[i] > largest){
            secondlargest = largest;
            largest=nums[i];
        }else if(nums[i] > secondlargest && nums[i] != largest){
            secondlargest= nums[i];
        }
    }
    if(secondlargest == Integer.MIN_VALUE){
        return -1;
 }
 return secondlargest;
}
public static void main(String[] args) {
    int nums[] = { 2,6,8,9,7};
    int result = findsecondlarge(nums);
    if (result == -1){
    System.out.println("Second largest element does not exist");
    } else {
        System.out.println("Second largest element is : " +result);
    }
    
}
    }
 
/**
 Time Complexity : O(n)
Space Complexity : O(1) 
*/
