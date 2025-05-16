package ch04.sec05.Missions;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args){
        int sum = 0;
        System.out.print("합계를 구할 숫자를 입력하세요. (종료:0) ");
        while (true){
            System.out.print(">> ");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value == 0)
                break;
            else
                sum += value;
        }
        System.out.printf("합계 : %,d", sum);

    }
}
