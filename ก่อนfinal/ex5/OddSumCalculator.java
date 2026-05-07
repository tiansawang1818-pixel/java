public class OddSumCalculator {
    public static int sumOdd(int n){
        if (n<=0){
            return 0;
        }

        if (n%2!=0) {
            return n+(sumOdd(n-2));
        }else{
            return sumOdd(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(10));
    }
}