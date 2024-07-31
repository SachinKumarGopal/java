import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your User ID: ");
        int uid = sc.nextInt();
        System.out.print("Enter your password: ");
        int ps =sc.nextInt();  
        
        if ((uid==2020202)&&(ps==2023))
            System.out.println("Login successfully");
        else
            System.out.println("Invalid userid and Password");
        sc.close();
    }
}
