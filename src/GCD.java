public class GCD {
    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return findGCD(b, a % b);
        }
    }

    public static void print(int a, int b){
        System.out.println(findGCD(a,b));
    }
}
