import java.util.Scanner;

public class area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your diameter :");
        int dia=sc.nextInt();
        System.out.println("Area of the circle :" +(3.14*dia*dia));
        sc.close();
    }
}