import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    int [] arr ={1,2,2,4,4,6,7,8,8};
    int count =removeDuplicates(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,count)));
    }
    public static int removeDuplicates(int[] nums) {
      if(nums.length == 0) return 0;
      int i = 0;
      for(int j = 1; j < nums.length;j++){
          if(nums[i] != nums[j]){
              //move i one step forward and put new number there
              nums[++i] = nums[j];

          }


      }
      //tell how many numbers (counting)
      return i+1;
    }
}
/*
i keep the unique numbers j checks every number */
