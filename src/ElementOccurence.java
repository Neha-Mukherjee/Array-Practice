import java.util.ArrayList;
import java.util.List;

public class ElementOccurence {
    public static void main(String[] args) {
     //int[] nums = {1,2,3,1,1,1,2,2};
     //   int[] nums ={};
        int[] nums ={1,1,2,2,-3,-3,-3};
        System.out.println(elementOccurence(nums));
}
    public static List<Integer> elementOccurence(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        //first pass to find possible candidates
        for (int num : nums) {
            if (count1 > 0 && num == candidate1) {
                count1++;

            }
            else if (count2 > 0 && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;

            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

        }
        // 2nd pass : verify candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }
        List<Integer> result = new ArrayList<Integer>();
        if (count1 > nums.length / 3)
            result.add(candidate1);
        if (count2 > nums.length / 3)
            result.add(candidate2);

        return result;
    }
}
