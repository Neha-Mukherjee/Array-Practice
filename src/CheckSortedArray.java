
public class CheckSortedArray {
    public static void main(String[] args) {
        int [] arr = { 5,4,3,2,1};
        isSorted(arr);
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        int i= 0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return false;
            }
            i++;
            }return true;
        }
    }
/*
the loop runs till i is less than the length of the array then
if checks if the element in i is greater than the element adjacent to it the array is not sorted
if yes then return false i ++ makes it run till the end of the loop
if every pair passes the loop then it returns true which means the array is sorted
*/