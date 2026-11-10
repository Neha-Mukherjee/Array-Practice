public class FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println(findMissing(nums));
    }

    public static int findMissing(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
/* this problem asks to find the missing number
* if there's n elements then the array must have n indices
* that mean the array must contain all elements from 0 to n
* say the array has 3 elements 3 0 1 but what's the missing number
* we find that by first finding the expected sum using the formula then calculating the actual sum present in the array
* return the result which is the missing number
* time complexity is O(n) coz one traversal of array
space complexity is O(1)
 */

