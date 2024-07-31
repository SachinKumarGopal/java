import java.util.Scanner;

public class fact_while {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number of terms :");
        int n = s.nextInt();
        int fac=1;
        while(n>=1){
            fac=fac*n;
            n=n-1;
        }
        System.out.println(fac);
    s.close();
    }
}
