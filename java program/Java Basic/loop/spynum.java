import java.util.Scanner;
public class spynum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n=s.nextInt();
        int n1=1, n2=2;
        n1=n%10;
        n2=n/10;
        if((n1*n2)==(n1+n2))
            System.out.println("this number is spy number");
        else
            System.out.println("it is not spy number");
        s.close();
    }
    
}
