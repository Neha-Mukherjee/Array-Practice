import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
  // int[] arr = {1,2,3,4,5};
  // int[] arr ={10,20,30,40};
      //  int[] arr ={4};
       int[] arr ={-1,-2,-4,-3};
   reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr){
        int temp = 0;
        int i =0 ;
        int j=arr.length-1;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
/*
* i starts at first index
* j starts at last index
* temp stores value temporarily while swappin
* time complexity - O(n)
* space complexity O(1)
* */