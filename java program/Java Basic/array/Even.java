import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int []a=new int[size];
        for (int i=0; i<a.length; i++){
            System.out.println("enter"+i+" array element");
            a[i]=sc.nextInt();
        }
        int j=0;
        while(j<a.length){
            if(a[j]%2==0){
                System.out.println("Even Number is "+a[j]);
                j++;
            }
        }
        sc.close();
    }
}
