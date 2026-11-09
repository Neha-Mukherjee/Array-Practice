import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,5,5,};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] nums) {
        int i;
        int candidate = nums[0];
        int count = 1;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else
                count--;
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }

        }
        return candidate;

    }
}
