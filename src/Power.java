public class Power {
    public static int findPower(int n, int  i){
        if(i == 0){
            return 1;
        }
        return n * findPower(n, i-1);
    }

    public static void print(int n, int i){
        int num = findPower(n, i);
        System.out.println(num);
    }
}
