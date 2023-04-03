public class BinominalCoefficient {
    public static int findBinom(int n, int k){
        if(k == 0 || n==k) {
            return 1;
        }else{
            return findBinom(n - 1, k - 1) + findBinom(n-1, k);
        }
    }

    public static void print(int n, int k){
        System.out.println(findBinom(n,k));
    }
}
