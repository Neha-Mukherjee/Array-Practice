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

/*
* move all zeros to the end of the array while maintaining the original order of non zero elements
* i decides where to place the elements
* j traverses the entire array and finds non zero elements
* whenever j is finding a non zero elements it copies the element to position i
* then increments i to prepare for next non zero element
* first loop only moves non zero elements to the beginning but it does not remove the old values left behind
* so a secong loop is used that fills the remaning positions with zeros
*
* */