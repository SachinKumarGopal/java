import java.util.Scanner;
public class paldrome {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter Your Number :");
        int n= s.nextInt();
        int tem=n;
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=((rev*10)+ld);
            n=n/10;
        }
        if(rev==tem)
            System.out.println( "your number is palindrome");
        else
            System.out.println("it is not palindrome");
        s.close();
    }
}
