import java.util.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
  // int [] arr = {1,2,-3}; //2
  // int [] arr ={2,3,-2,4}; //6
      //  int [] arr ={-2,0,-1}; //0
      //  int [] arr ={-2,-3,-4}; //12
        //int [] arr ={-5}; //-5
     //   int [] arr ={0,0,0}; //0
        int [] arr ={-2,3,-4};

        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        //for checking empty array and avoiding indexoutofbounds exception
        if (nums.length==0)
            return -1;
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result = nums[0];
        //loop starts from the second element
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = Math.max(num,Math.max(num*maxProduct,num*minProduct));
            int tempMin = Math.min(num,Math.min(num*maxProduct,num*minProduct));
            maxProduct=tempMax;
            minProduct=tempMin;
            result =Math.max(result,maxProduct);

        }
        return result;
    }
}
/*
* 3 variables is used to initialise the first element because a valid starting value is needed before the loop begins
* each variable is tracking something different
* maxproduct tracks the max product ending at the current index
* min product for minimum product ending at the current index
* result stores the max product found anywhere in the array
* both min and max product are used because of negative numbers
* tempmax and tempmin are calculated using maxproduct and minprodcut values
* temp variables used so updations doesnt affect the calculation of one another
*  result is initialised with nums[0] because initially we have processed only the first element.
 It also handles arrays containing only negative numbers.
* */