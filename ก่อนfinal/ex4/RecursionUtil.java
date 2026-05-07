public class RecursionUtil {
    static public int sumEven(int n){
        if(n<=0){
            return 0;
        }

        if (n%2==0) {
            return n+(sumEven(n-2));
        }
        else{
            return sumEven(n-1);
        }
    }

    static public String reverseString(String str){
        if(str.length()<=0){
            return"";
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
    



    public static void main(String[] args) {
        System.out.println(sumEven(6));
        System.out.println(reverseString("hello"));
    }
}
