import java.math.*;
public class TimeComplexityOfExponential {
    double fastExponential(long n) {
        if (n == 0) {
            return 1;
        }
        double half = fastExponential(n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * 2;
        }
    }

    public static void main(String[] args) {
        TimeComplexityOfExponential te = new TimeComplexityOfExponential();

        long n=1000000000;
        long y = System.nanoTime();
        double res=te.fastExponential(n);
        long z = System.nanoTime();
        System.out.println("Fast exponentiation: "+(float)(z-y)/1000000000);

        y = System.nanoTime();
        res =Math.pow(2,n);
        z = System.nanoTime();
        System.out.println("Math.pow function:  "+(float)(z-y)/1000000000);

        res=1;
        y = System.nanoTime();
        for(int i=0;i<(n*10);i++){
            res*=2;
        }
        z = System.nanoTime();
        System.out.println("For loop: "+(float)(z-y)/1000000000);
    }
}
