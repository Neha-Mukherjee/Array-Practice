
public class FindMinMax {
    public static void main(String[] args) {
        int [] arr ={ 22,33,-24,55,76,89};
        int [] res = findMinMax(arr);
        System.out.println("min : " + res[0]);
        System.out.println("max : " + res[1]);
    }


    public static int[] findMinMax(int[] num) {
       int min = num[0];
       int max = num[0];
       for (int i = 1; i < num.length; i++) {
           if (num[i] < min)
                min = num[i];
           if (num[i] > max)
                max = num[i];

       }
        return new int[]{min,max};
       }

}
/*initialsing the first element in both min and max then looping through the array
from the second element
checking if the element in second is less than the minimum element
for eg here 33 <22 its false then next if statement 33 > 22 its true then
max gets reassigned to element 33 the loop continues till the end of the array length
return min max array and print using main
in main() findMinMax method return an array that contains the min max*/