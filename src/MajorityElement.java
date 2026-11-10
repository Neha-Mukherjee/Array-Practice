import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,1,3,4,5,5,};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] nums) {
        int i;
        //the element currently considered as the majority candidate
        int candidate = nums[0];
        //the element's current amount of repetitions in the array(candidate's current voting balance
        int count = 1;
        //first pass - find teh candidate
        for (i = 1; i < nums.length; i++) {
            //the first case if the cuurent element is equal to the candidate
            //then increase the count by 1
            if (nums[i] == candidate) {
                count++;

            }
            //case 2 - the element is different then decrease the count by 1
            else
                count--;
            //when the vote or the count for previous candidate has completely vanished
            //select the current element as the new candidate
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }


        }
        //second pass : verify that the candidate is repeating strictly more than n/2 times
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > nums.length/2)
        return candidate;

        return -1;

    }
}
/*Boyer moore voting algorithm implementation
* majority element happens when the element appears more than n/2 times in an array
* for eg : array length = 7 then the element should repeat/appear more than 3.5 times i .e atleast 4 times
*the second using to verify if the element is appearing moret han n/2 times or not if not the the code return -1
*
*  */
