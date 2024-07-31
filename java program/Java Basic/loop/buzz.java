import java.util.Scanner;

public class buzz {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n=s.nextInt();
        int ld=n%10;
        if ((ld==7)||(n%7)==0)
            System.out.println("This is buzz number");
        else
            System.out.println("it not buzz number");
        s.close();
        
    }
}
