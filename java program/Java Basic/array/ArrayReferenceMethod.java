public class ArrayReferenceMethod {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(arr);
        demo(arr);

    }
    public static void demo(int[]arr){
        System.out.println(arr);
        System.out.println(arr.length);
    }
}

