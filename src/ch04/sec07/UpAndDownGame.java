package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100.0) + 1;

        while (true) {
            System.out.print("1~100 사이 숫자를 입력해주세요 > ");
            int number = scanner.nextInt();

            if (answer == number) {
                System.out.println("정답!!");
                break;  // break를 감싸고 있는 가장 가까운 반복문을 빠져나옴
            } else if (answer > number){
                System.out.println("Up!");
            } else if (answer < number) {
                System.out.println("Down!");
            }
        }
        scanner.close();
    }
}
