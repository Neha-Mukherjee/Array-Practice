public class MaximumCircularSubarraySum {

    public static int maxCircularSum(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        int totalSum = 0;
         //We need maxSum for the normal subarray and minSum to calculate the circular subarray
        int maxSum = nums[0];
        int minSum = nums[0];

        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {
           //max subarray sum
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);
            //min subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }

        // If all elements are negative
        //When all elements are negative, totalSum - minSum would incorrectly give 0.
        //We must return the largest (least negative) element instead.
        if (maxSum < 0) {
            return maxSum;
        }

        // Compare normal and circular subarray sums
        //subtract minsum from totalsum because we want to remove the part that reduces the sum
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {

        int[] nums = {5, -3, 5};

        System.out.println(maxCircularSum(nums));
    }
}

/* kadane's algorithm is used

circular array means the first and last elements are connected

 */