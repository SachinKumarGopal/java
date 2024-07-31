import java.util.Scanner;

public class gpspredict {
    public static void main(String[] args) {
        Scanner gpssc = new Scanner(System.in);
        System.out.print("Enter your CGPA :");
        int cgpa =gpssc.nextInt();  
        if (cgpa>=8.5)
            System.out.println("You got DIstination");
        else if(cgpa>=7.5)
            System.out.println("You got First class");
        else if(cgpa>=6.5)
             System.out.println("You got second class");
        else
            System.out.println("you are failed in your exam");
        gpssc.close();
    }
}
