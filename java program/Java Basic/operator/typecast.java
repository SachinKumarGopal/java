public class typecast {
    public static void main(String[] args) {
        //case1: WIDENING
        byte b1=100;
        int i1=b1; // IMPLICIT TYPECASTING
        System.out.println(i1);

        //case2: NARROWING
        int i2=100;
        byte b2=(byte)i2; //EXPLICIT TYPECASTING
        System.out.println(b2);
    }
}
