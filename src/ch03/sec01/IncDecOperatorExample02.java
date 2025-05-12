package ch03.sec01;

public class IncDecOperatorExample02 {
    public static void main(String[] args) {
        int i1 = 5;
        System.out.printf("i1: %d \n", i1++);   // 5
        System.out.printf("i1: %d \n", i1++);   // 6
        System.out.printf("i1: %d \n", i1); // 7

        System.out.println("------------");

        int i2 = 5;
        System.out.printf("i2: %d \n", ++i2);   // 6
        System.out.printf("i2: %d \n", ++i2);   // 7
        System.out.printf("i2: %d \n", i2); // 7
    }
}
