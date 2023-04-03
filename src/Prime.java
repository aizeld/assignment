public class Prime {

    public static String isPrime(int n, int i){
        //base cases
        if(n <=2){
            if(n == 2){return "Prime";}else{
                return "Composite";
            }
        }
        if(n%i == 0){
            return "Composite";
        }
        if(i*i >n){
            return "Prime";
        }
        //recursive base
        return isPrime(n, i+1);

    }

    public static String isPrime(int n) {
        return isPrime(n, 2);
    }

    public static void print(int n){
        System.out.println(isPrime(n, 2));
    }

}
