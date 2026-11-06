import java.util.Arrays;

public class SumAndAvg {
    public static void main(String[] args) {
        int [] arr ={2,5,3};
        double[] res=sumAndAvg(arr);
        System.out.println(Arrays.toString(res));
    }
    public static double[] sumAndAvg(int[] arr) {
       //for when array is empty
        if(arr.length==0){
            return new double[]{0,0};
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double avg =(double) sum / arr.length;
        return new double[]{sum,avg};
    }
}
