public class isPrime {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(isPrimeNumber(n));
    }
    public static boolean isPrimeNumber(int n){
        for(int i=2;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
