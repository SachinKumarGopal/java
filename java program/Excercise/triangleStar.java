// to print the star(*) in the patter of triangle
import java.util.Scanner;

public class triangleStar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of column :");
        int n=sc.nextInt();
        printStar(n);
        sc.close();
    }
    public static void printStar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n)-1; j++){
                if((i+j==(n*2)||(i==j))||((i<=j)&&(i+j<n*2)))
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
/* output:
 * enter no of column :
5
 * * * * * * * * *
   * * * * * * *  
     * * * * *    
       * * *      
         *      
 */
