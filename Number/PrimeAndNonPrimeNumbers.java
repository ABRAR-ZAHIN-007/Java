import java.util.*;

public class PrimeAndNonPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T -- > 0) {
            int n = sc.nextInt();
            boolean isPrime = true;
            for (int i = 2; i <= n-1; i++) {
                if (n%2 == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime numbers");
            }
            else {
                System.out.println("Not prime numbers");
            }
        }    
    }
   
}
