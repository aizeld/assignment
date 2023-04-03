public class Factorial {
    public static int findFact(int n ){
        if(n == 0){
            return 1;
        }///base

        return n * findFact(n - 1);

    }

    public static void print(int n){
        int num = findFact(n);
        System.out.println(num);
    }
}
