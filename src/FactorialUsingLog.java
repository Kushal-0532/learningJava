public class FactorialUsingLog
{
    long findFact(long n){
        if(n>1){
            return (findFact(n-1)*n);
        }
        else{
            return 1;
        }
    }

    long findFactByDivConq(int n){
        if(n%2==0){
            return findFactByDivConq(n/2)*findFactByDivConq(n/2);
        }
        if(n%2!=0){
            return findFactByDivConq((n-1)/2)*findFactByDivConq(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        FactorialUsingLog factorialUsingLogObj = new FactorialUsingLog();

        int n=9;
        long y = System.nanoTime();
        long res = factorialUsingLogObj.findFact(n);
        long z = System.nanoTime();
        System.out.println(res+" "+(z-y));

        res=1;
         y = System.nanoTime();
        for(int i=1;i<n+1;i++){
            res*=i;
        }
         z = System.nanoTime();
        System.out.println(res+" "+(z-y));
    }
}
