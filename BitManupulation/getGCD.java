public class getGCD {
    public static void main(String args[]){
        long a = 54;
        long b =28;
        System.out.println(GCD(a,b));;
    }

    public static long GCD(long a , long b){

        if(b==0){
            return a;
        } 
            return GCD(b,a%b);
    }
}
