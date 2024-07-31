import java.util.Scanner;
class LowScore{

    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of student :");
        int size=sc.nextInt();
        int []a=new int[size];
        for(int n=0; n<a.length; n++){
            System.out.println("Enter score of student "+(n+1)+" :");
            a [n]=sc.nextInt();
        }
        int low=a[0];

        for(int i=0; i<a.length; i++){
            
            if (a[i]<low){
                low=a[i];
            }
            
        }
        System.out.println("the lowest value :" +low);
        sc.close();
    }
}