import java.util.Scanner;
public class diag_star {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Press 1 for top left triangle");
        System.out.println("Press 2 for buttom left triangle");
        System.out.println("Press 3 for top right triangle");
        System.out.println("Press 4 for buttom right triangle");
        System.out.println("ENTER YOUR CHOICE: ");
        int num= s.nextInt();
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number of stars: ");
        int n=s1.nextInt();
         System.out.println();
        switch (num) {
            case 1: for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                        if(((i==1)||(j==1))||((i+j))<=(n+1)){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                            
                }
                        System.out.println();
            }
            break;
            case 2: for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                        if(((i==n)||(j==1))||(i>=j)){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                            
                }
                        System.out.println();
            }
            break;
            case 3: for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                        if(((i==1)||(j==n))||((i<=j))){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                            
                }
                        System.out.println();
            }
            break;
            case 4: for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                        if(((i==n)||(j==n))||((i+j))>=(n+1)){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                            
                }
                        System.out.println();
            }
            break;
        }
        s.close();
        s1.close();
     }
  }
    

