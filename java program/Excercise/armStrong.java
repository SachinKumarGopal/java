import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmStrong(n));
        sc.close();
    }
    public static int isArmStrong(int num) {
        int temp = num; 
        int count = 0; 
        int sum = 0; 
        while (num != 0) {
            count++; 
            num /= 10;
        }
        num = temp; 
        while (num != 0) {
            int lastDigit = num % 10; 
            int prod = 1; 
            for (int i = 1; i <= count; i++) {
                prod *= lastDigit; 
            }
            sum += prod; 
            num /= 10;
        }
        if (sum == temp)
            return 1 ;
        else
            return -1 ;
    }
}