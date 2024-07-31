import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter multiplication table number");
        int mul=sc.nextInt();
        System.out.println("Enter your base number :");
        int bas=sc.nextInt();
        int n=1;
        while(n<=bas){
            System.out.println(mul+"*"+n+"="+(mul*n));
            n=n+1;
            sc.close();
        }
    }
}
