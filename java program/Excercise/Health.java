import java.util.Scanner;

public class Health {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Systolic BP:");
        int sp=sc.nextInt();
        System.out.println("Enter Diastolic BP:");
        int dp=sc.nextInt();
        checkBp(sp, dp);
        sc.close();
    }
        public static String checkBp(int sp, int dp){
            if(sp>90  || dp<60){
                System.out.println("your Bp is low. please consult a doctor");
            }
            else if ((90<=sp && sp<=120) && (60<=dp && dp<=80)){
                System.out.println("Your BP is elevated. Please monitor regularly");
            }
            else if ((121<=sp && sp<=129) && (60<=dp && dp<=80)){
                System.out.println("Yout blood pressure is high (stage 1 hypertension). Please consult a healthare professional");
            }
            else if ((130<=sp && sp<=139) && (80<=dp && dp<=89)){
                System.out.println("Your blood pressure is elevated. Please monitor regularly.");
            }
            else if ((140<=sp) && ( dp>90)){
                System.out.println("Your bolld pressure is high(stage2 hypertension). please consult a healthcare professional immediately");
            }
            else{
                System.out.println("Invalid blood pressure readings. ");
            }
            return null;
            
        }
    
    
}
