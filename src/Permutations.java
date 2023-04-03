public class Permutations {
    public static void findPermuations(String str, String prefix){
        if(str.length() == 0){
            System.out.println(prefix);
        }else{
        for(int i = 0 ; i < str.length();i++){
            String newline = prefix+str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermuations(newStr, newline);
        }}
    }

    public static void print(String str){
        findPermuations(str, "");
    }
}
