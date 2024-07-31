import java.util.Scanner;

public class Lcm2No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a=sc.nextInt();
        System.out.println("Enter number 2 :");
        int b=sc.nextInt();
        findLcm(a,b);
        sc.close();
    }
    public static void findLcm(int a, int b){
        int lar=(a>b)?a:b;
        while (true) {
            if(lar%a==0 && lar%b==0){
                break;
            }
            lar++;
        }
        System.out.println(lar);

    }
    
}
