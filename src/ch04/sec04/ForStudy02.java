package ch04.sec04;

public class ForStudy02 {
    public static void main(String[] args){
        // Hello, world!! 콘솔 5회 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world!!");
        }

        System.out.println("----------");

        // i < 15 는 수정 불가능. 나머지는 수정 가능
        // Hello, world!! 콘솔 5회 출력
        for (int i = 10; i < 15; i++) {
            System.out.println("Hello, world!!");
        }

        System.out.println("----------");

        // i-- 는 수정 불가능. 나머지는 수정 가능
        // Hello, world!! 콘솔 3회 출력
        for (int i = 3; i > 0; i--) {
            System.out.println("Hello, world!!");
        }
    }
}
