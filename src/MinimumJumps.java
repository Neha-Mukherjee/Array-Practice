public class MinimumJumps {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println(minJumps(nums));

    }

    public static int minJumps(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        if (nums[0] == 0) {
            return -1;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {

                if (farthest == currentEnd) {
                    return -1;
                }

                jumps++;
                currentEnd = farthest;

                if (currentEnd >= nums.length - 1) {
                    return jumps;
                }
            }
        }

        return -1;
    }


}

/*
minimum number of jumps required to reach the last position of an array
each element is the amount of jumps you have
 */