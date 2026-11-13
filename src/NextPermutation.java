import java.util.Arrays;

public class NextPermutation {


    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Find the first decreasing element from right to left
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Find the next greater element and swap
        if (i >= 0) {

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Reverse the elements after index i
        int left = i + 1;
        int right = n - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}

/*
the question ask to rearrange the given numbers to create the next bigger arrangement possible
we cannot remove or add anything
bigger arrangement is when the permutated numbers together like 132>123 
 */