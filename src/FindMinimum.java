import java.util.Arrays;

public class FindMinimum {
    public static int FindMin(int n, int[] array){
        if(n == 1){
            return array[0]; //base
        }

        int numMin = FindMin(n-1, Arrays.copyOfRange(array, 1, n));

        if(array[0] <= numMin){
            return array[0];
        }else{
            return numMin;
        }
    }


    public static void print(int n ,int[] array) {
        System.out.println(FindMin(n , array));
    }
}
