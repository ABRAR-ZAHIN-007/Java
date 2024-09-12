import java.util.Scanner;

/**
 *
 * @author abrarzahin
 */
public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[5];
        int length = nums.length;
        for(int i = 0; i < length; i++){
            nums[i] = sc.nextInt();
        }
//        for(int n : nums ){
//            System.out.print(n + "\t");
//       }

        for(int i = 0; i < length; i++){
           System.out.println(nums[i] + "\t");
        }
    }
    
}
