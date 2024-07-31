import java.util.Scanner;

public class fact_for {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your Number terms  ;");
        int n1=s.nextInt();
        int fac=1;

        for(int n=n1; n>=1; n--){
            fac=fac*n;
        }
        System.out.println(fac);
        s.close();  
    }
}
