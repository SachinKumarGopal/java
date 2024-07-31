import java.util.Scanner;

public class FirstMaxElement{
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
           int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element [" + (i ) + "] : ");
                arr[i] = scanner.nextInt();
            }
            int max_num=arr[0];
            for (int i=1; i<arr.length; i++){
                if (arr[i]>max_num){
                    max_num=arr[i];
                }
            }
            System.out.println(max_num);
            scanner.close();
        }
        
    }
    
