import java.util.Arrays;

public class Average {
    public static double findAverage(int n, int[] array){
        if(n == 1) {return array[0];///base
        } else{
        return (findAverage(n-1,array) * (n-1) + array[n-1]) / n;}
    }
    public static void print(int n ,int[] array) {
        System.out.println(findAverage(n , array));
    }
}
