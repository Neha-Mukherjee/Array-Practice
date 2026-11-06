import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {5,5,2};
        int res =findSecondLargest(arr);
        System.out.println(res);


    }

    public static int findSecondLargest(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        }
            else if(num > secondLargest && num < largest) {
                    secondLargest = num;
                }

    }
    if(secondLargest == Integer.MIN_VALUE){
        return -1;
    }
    return(secondLargest);

        }

    }
/*
largest and second largest are initialised with integer.MINVALUE
then using enhanced for loop to get the elements inside num
if num is larger than largest then largest becomes second largest
and num element becomes largest
if num is larger than second largest and also less than largest so it becomes second largest
for eg [5,2,9,3]
checks num is greater than min value that is true
largest becomes 5 ,second largest still has min value the loop continue likes this
with second largest -5 largest - 9
returning -1 because this sum requires second largest when there's an array
that has same elements but id needed largest can also be returned
something needs to be returned because else when this edge case occur [5,5,5]
it will return the integer.MINVALUE value in java

 */
