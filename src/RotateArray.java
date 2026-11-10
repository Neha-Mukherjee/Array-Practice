import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) return;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
/*
* a normal reversal which reverses the entire array is performed using temp variable in teh first call
* this bring last k elements to the beginning but their order is reversed
* then in second method call only first k elements are reversed to restore the order
* in third call we reversing the remaining elements to restore teh order
* time complexity - O(n)
* space complexity - O(1)
* we reverse array 3 times but each reversal takes up linear time
* */