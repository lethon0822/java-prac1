package ch04;

public class EvenOdd {
    public static void main (String[] args) {
        // 홀, 짝 + 랜덤 숫자

        int num = 32;
        System.out.printf("%d / %d = %d \n", num, 5, num / 5);
        System.out.printf("%d %% %d = %d \n", num, 5, num % 5);

        if (num % 2 == 1) {
            System.out.println(num + "은 홀수입니다.");
        } else {
            System.out.println(num + " 은 짝수입니다.");
        }
    }
}
