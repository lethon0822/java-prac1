package ch04.sec04;

public class ForStudy04 {
    public static void main(String[] args) {
        // A작업 "야!"
        // B작업 "야!" 5번 반복
        // C작업 B작업 반복

        //C
        for (int k=0; k<5; k++) {
            //B
            for (int i = 0; i < 5; i++)
                System.out.println("야!");   //A
        }
    }
}
