public class BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 101;
        System.out.println(getDecimal(binary));
    }
    public static long getDecimal(long binary){
        long ld=0;
        long dv=0;
        long base = 1;
        while(binary>0){
            ld = binary%10;
            binary =binary/10;
            dv = dv+ld*base; 
            base = base*2;
        }
        return dv;
    }
}
