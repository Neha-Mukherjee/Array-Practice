import java.util.Arrays;

public class ArrayProduct {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // Store products of elements to the left
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply by products of elements to the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}
/* the first loop calculates all the elements tot its left and store it in result array
* starting from 2nd element so there will be elements to it's left
* the second loop calculates the elements to the right starting from last element
* the result of the left array are then multiplies with the right product one by one
* then right product is updated so it contains the product of all elements to the right */

