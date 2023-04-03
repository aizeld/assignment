public class CheckDigits {
    public static String CheckingDigits(String s){
        if(s.length() == 0){
            return "Yes";
        }
        if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
            return CheckingDigits(s.substring(1));
        }else{
            return "No";
        }
    }

    public static void print(String s){
        System.out.println(CheckingDigits(s));
    }

}
