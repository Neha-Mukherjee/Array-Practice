public class LargestSumOfContiguousSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(largestSum(nums));
    }
    public static int largestSum(int[] nums) {

    int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            //at every element we get two choices here
            // start a new subarray from current element or extend the previous one by adding the current element
            //whichever gives the bigger sum is chosen
            //option 1 -> 1 option 2 -> -2+1=-1 option 1 chosed
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            //keeps track of the largest sum like is my current sum bigger than the sum currently as maxSum
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
/*
the algo used here is Kadane's Algorithm
the goal is to find a contiguous subarray whose sum is largest
contiguous means every number that are next to each other in the original array without skipping any elements
current stores the maximun sum of a contiguous subarray ending at the current position
maxSum stores the largest sum found anywhere and keeps updating it



 */