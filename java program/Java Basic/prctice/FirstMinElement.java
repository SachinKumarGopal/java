import java.util.Scanner;

public class FirstMinElement {
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
            int min_num=arr[0];
            for (int i=1; i<arr.length; i++){
                if (arr[i]<min_num){
                    min_num=arr[i];
                }
            }
            System.out.println(min_num);
            scanner.close();
        }
        
    }
    
