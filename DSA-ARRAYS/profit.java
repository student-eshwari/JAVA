// 02-program
import java.util.*;
public class profit {
    public static int maxprofit ( int[] price){
      int buy = price[0];
      int profit = 0;
    
      for (int i = 1; i < price.length; i++){
      if(price[i] < buy){
      buy = price[i];
    
 }    else if (price[i] - buy > profit){
      profit = price[i] - buy;
    }
    }
      return profit;
    }
  public static void main (String[]args){
      int [] price = { 4,7,8,9,3,2,1};
      System.out.println(maxprofit(price));
    }
   }
