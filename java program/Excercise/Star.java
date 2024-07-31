import java.util.Scanner;
public class Star{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of stars :");
        int n=sc.nextInt();
        printStar(n);
        sc.close();
    }
    public static void printStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((i+j==(n+1))||(i==j))
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
