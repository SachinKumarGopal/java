import java.util.Scanner;
public class starpattern2 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter Number of Stars :");
        int n=s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((j==n)||(i==n))
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        s.close();

        }

        
    }
}
