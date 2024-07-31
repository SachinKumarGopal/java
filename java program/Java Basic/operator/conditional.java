public class conditional {
    public static void main(String[] args) {
        int a=50;
        int b=20;
        int c=30;
        int greatest=a>b? (a>c?a:c):(b>c?b:c);
        System.out.println(greatest);

        int d=40;
        int e=20;
        int f=60;
        int smallest=(d>e)?(a>f?d:f):(e>f?e:f);
        System.out.println("Largest:" +smallest);
        
    }
}
