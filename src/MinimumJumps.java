public class MinimumJumps {
    public static void main(String[] args) {
       // int[] nums = {2, 5, 0, 0, 1};
        int[] nums ={2, 5, 0, 0, 1};
        System.out.println(minJumps(nums));

    }

    public static int minJumps(int[] nums) {
      //handling edge cases say when there's only one element we dont need to jump
        if (nums.length <= 1) {
            return 0;
        }
        //if first element is zero then we cannot move forward

        if (nums[0] == 0) {
            return -1;
        }
       //number of jumps taken . intially zero coz we havent jumpes yet
        int jumps = 0;
        //the end we can reach using the current number of jumps    . zero coz we standin at index 0 no jump made yet
        int currentEnd = 0;
        //how much far we can reach . zero coz we havent calculated yet how far
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
         //math max compares the previous farthest value with the new ly calculated one and keeps the the bigger one
            farthest = Math.max(farthest, i + nums[i]);
             //checks if we have reached the end of the range covered by our current number of jumps
            if (i == currentEnd) {

                if (farthest == currentEnd) {
                    return -1;
                }

                jumps++;
                currentEnd = farthest;
              //checks if the number reached the destination
                if (currentEnd >= nums.length - 1) {
                    return jumps;
                }
            }
        }

        return -1;
    }


}

/*
the code assumes all arrays are non negative
minimum number of jumps required to reach the last position of an array
each element gives the max number of positions i can jump forward
this is greedy algorithm because at each stage we keep track of the farthest position we can reach
 */