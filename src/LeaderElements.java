import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderElements {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,1};
        System.out.println(majorityElement(arr));

    }
    public static List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
    if(len==0){
        return new ArrayList<>();
    }
    int max = nums[len-1];
    List<Integer> leader =new ArrayList<>();
    leader.add(max);
    for(int i = len-2;i>=0;i--){
        if(nums[i]>max){
            leader.add(nums[i]);
            max=nums[i];
        }
    }
    Collections.reverse(leader);
    return leader;
    }

}
