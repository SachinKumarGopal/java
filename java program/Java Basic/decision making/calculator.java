import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 for the addition");
        System.out.println("Press 2 for the substraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to exit from the calculator");
        Scanner s=new Scanner(System.in);;
        System.out.print("Enter your option");
        int choice=s.nextInt();
        if (choice<=4){
        System.out.print("enter the number 1 :");
        int n1=s.nextInt();
        System.out.print("enter the number 2 :");
        int n2=s.nextInt();

        switch(choice){
            case 1:System.out.println("The result is  " +(n1+n2));
            break;
            case 2:System.out.println("The result is  " +(n1-n2));
            break;
            case 3:System.out.println("The result is  " +(n1*n2));
            break;
            case 4:System.out.println("The result is  " +(n1/n2));
            break;
        }
    }
    else{
        System.out.println("Enter the valid numbers");
    }
    s.close();
}
}
