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

        long n=999999999;
        long y = System.nanoTime();
        double res=te.fastExponential(n);
        long z = System.nanoTime();
        System.out.println("Fast exponentiation: "+(z-y));

        y = System.nanoTime();
        res =Math.pow(2,1000);
        z = System.nanoTime();
        System.out.println("Math.pow function:  "+(z-y));

        res=1;
        y = System.nanoTime();
        for(int i=0;i<n;i++){
            res*=2;
        }
        z = System.nanoTime();
        System.out.println("For loop: "+(z-y));
    }
}
