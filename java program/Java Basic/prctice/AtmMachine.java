import java.util.Scanner;
public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM machine");
        System.out.println("Press 1 for Check Balance");
        System.out.println("Press 2 for Cash Withdraw");
        System.out.println("Press 3 for Deposit Cash");
        System.out.println("Press 4 for exit ATM");
        System.out.println("Enter Your choice");
        int n=sc.nextInt();
        int mon=5000;
        switch(n){
            case(1):{
                System.out.println("Your current balance is: "+mon);
                break;}
            case(2):{
                System.out.println("Enter amount to withdraw :");
                int monwi=sc.nextInt();
                if(mon>monwi){
                    System.out.println("Withdraw Successful | Your current balance is: "+(mon-monwi));}
                else if(mon<monwi){
                    System.out.println("Insufficient Funds. | Check your back balance");}
                else{
                    System.out.println("Invalid transistion");}}
                break;
             case(3):{
                System.out.println("Enter amount to deposit :");
                int monde=sc.nextInt();
                if(monde>0){
                    System.out.println("Deposit Successful | Your current balance is: "+(mon+monde));
                }
                else{
                    System.out.println("Invalid transistion");
                }
                break;}
            case(4):{
                System.out.println("You are exited from the ATM machine");
                break;}
        }
        sc.close();
        System.out.println("Thank you for using ATM Machine");
    }
}
    
