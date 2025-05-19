package ch04.sec08;

public class Game369 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            System.out.printf("i = %d ", i);
            int temp = i;

            do {
                if (temp % 10 % 3 == 0 && temp % 10 != 0) {
                    System.out.print("짝");
                }
                continue;
            } while ((temp /= 10) != 0);

            System.out.println();
        }
    }
}


