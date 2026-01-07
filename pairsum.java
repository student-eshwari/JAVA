// 01-program
import java.util.HashSet;
public class pairsum {
     public  static boolean pairsum (int[] arr, int target)  {
           HashSet<Integer>set = new HashSet<>();

     for (int i=0;i<arr.length; i++) {
        int complement=target-arr[i];

     if (set.contains(complement)){
         return true;
        }
        set.add(arr[i]);
}
        return false;
}

public static void main(String[] args) {
       int [] arr = {11,14,15,4,6,8,9,10,3};
       int target = 16;
       if(pairsum(arr, target)) {
            System.out.println("true");
    }  else {
            System.out.println("false");
    }
  }
}

