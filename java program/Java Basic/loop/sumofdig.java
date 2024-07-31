import java.util.Scanner;
public class sumofdig {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= s.nextInt();
        int r=0, sum=0;
        while (n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;}  
            System.out.println(sum);
            s.close();
    }
}
