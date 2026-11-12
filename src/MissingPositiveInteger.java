public class MissingPositiveInteger {
    public static void main(String[] args) {
       // int[] nums = {3, 4, -1, 1};
        int [] nums={0,1,1};

        System.out.println(missingPositive(nums));
    }

    public static int missingPositive(int[] nums) {

      //
        for (int i = 0; i < nums.length; i++) {
            //swap logic while the loop checks that the is positive , it is upto length n of the array not more than that
            //and the correct number is not in its correct index and to avoid an infinite loop caused by duplicates it check to only continue the swap when the current element and the index element is different
            while (nums[i] > 0 && nums[i] <= nums.length && i != nums[i] - 1 && nums[i] != nums[nums[i] - 1]) {
                int temp;
                int correctIndex = nums[i] - 1;
                temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        //finding the first positive missing integer
        for (int i = 0; i < nums.length; i++) {
            //checks that the current number is not equal to the number that we expect it to have
            //when it doesnt matches the expected number is returned because that is the missing positive integer
        if (nums[i] != i + 1) {
                return i + 1;
            }

        }
        //when there's nothing missing
        return nums.length + 1;
    }
}


//cyclic sort wihtout using a new list so that the extra space remain o1 and time stays On
//using while loop instead of an if because after swapping the current index might also be in wrong position


