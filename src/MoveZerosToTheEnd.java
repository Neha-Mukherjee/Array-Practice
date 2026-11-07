import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
//  int [] arr ={0,1,0,0,2,4,5};
// int[] arr={0,0,0};
// int[] arr={1,2,-3};
  int[] arr={-2,0,1,0,-3};
  moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
    int i = 0;
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=0) {
            nums[i] = nums[j];
            i++;

        }
        }
        while(i<nums.length){
            nums[i] =0;
            i++;
            }
        }
    }

