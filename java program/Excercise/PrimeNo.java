import java.util.Scanner;

public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("it is prime number");
        }
        else{
            System.out.println("it is not prime number");
        }
        sc.close(); 
    }
    public static boolean isPrime(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        else{
            return false;
        }
         
    }
}
