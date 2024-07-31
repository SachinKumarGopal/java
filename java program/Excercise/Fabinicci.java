import java.util.Scanner;

public class Fabinicci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n :");
        int n=sc.nextInt();
        fabi(n);
        sc.close();
    }
    public static void fabi(int n){
        int a=0;
        int b=1;
        System.out.print("0,1");
        for(int i=1; i<=n-2; i++){
            
            int sum=a+b;
            System.out.print(","+ sum);
            a=b;
            b=sum;

        }
    }
}
