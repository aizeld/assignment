public class Fibbonaci {
    public static int findFibb(int n){
        if(n==0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return findFibb(n-1)+findFibb(n-2);
    }

    public static void print(int n){
        int num = findFibb(n);
        System.out.println(num);
    }
}
