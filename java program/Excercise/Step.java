import java.util.Scanner;

public class Step {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the steps :");
        int stp=sc.nextInt();
        checkActivity(stp);
        sc.close();
    }
    public static void checkActivity(int stp){
        if(stp<5000){
            System.out.println("Sedentary");
        }
        else if(5000<=stp && stp<=7499){
            System.out.println("Low Active");
        }
        else if(7500<=stp && stp<=9999){
            System.out.println("Somewhat Active");
        }
        else if(10000<=stp && stp<=12499){
            System.out.println("Active");
        }
        else if(stp>12500){
            System.out.println("Highly active");
        }
        else{
            System.out.println("invalid steps");
        }
    }
    
}
