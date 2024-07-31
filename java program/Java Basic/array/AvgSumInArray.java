import java.util.Scanner;

public class AvgSumInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int size=sc.nextInt();
        int[]a=new int[size];
        for (int i=0; i<a.length;i++){
            System.out.println("Enter" +i+"array element :");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0; j<a.length; j++){
            sum=sum+a[j];
        }
            System.out.println("Sum of all interger in array :"+sum);
        
        int avg=(sum/size);
        System.out.println("Average sum of all integer is "+avg);
        sc.close();
    }
}
