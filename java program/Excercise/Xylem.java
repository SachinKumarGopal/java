// to find the number is xylem or phloem if the number is xylem return 1 else it return 0
import java.util.Scanner;

 class Xylem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println(checkXylemOrPhloem(num1));
        scanner.close();
    }
    public static int checkXylemOrPhloem(int num) {
        int innerSum = 0;
        int outerSum = num % 10; 
        num /= 10; 
        while (num > 9) {
            innerSum += num % 10;
            num /= 10;
        }
        outerSum += num;
        if (outerSum == innerSum)
            return 1; 
        else
            return 0;
    }
}
/* Output
 * 25
   0
 */
