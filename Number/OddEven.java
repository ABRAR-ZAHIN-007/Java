import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++  ) {
                int n = sc.nextInt();

                if ( n % 2 == 0 ){
                    System.out.println( " is even.");
                } 
                else {
                    System.out.println( " is odd.");
                }
            }
        }
         
    }
}
