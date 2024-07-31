import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size=sc.nextInt();
        int []a=new int[size];
        int i=0;
        while(i<a.length){
            System.out.println("enter "+i+"array element:");
            a[i]=sc.nextInt();
            i++;
        }
        for(int j=0; j<a.length;j++){
            System.out.print(a[j]+" ");
        }
        sc.close();
    }
}
