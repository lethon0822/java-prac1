package ch04.sec07.Mission;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int money = 0;

        systemout:
        while (true){
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print(">> ");
//          int selected = scanner.nextInt();
            String selected = scanner.next();
//            스위치문 활용
            switch (selected){
                case "1":
                    System.out.print("예금액 : ");
                    money = scanner.nextInt();
                    sum += money;
                    break;
                case "2":
                    System.out.print("출금액 : ");
                    money = scanner.nextInt();
                    if ( sum - money < 0) {
                        System.out.println("잔액 부족!");
                        break;
                    }
                    sum -= money;
                    break;
                case "3":
                    System.out.printf("잔고 : %,d \n", sum);
                    break;
                case "4":
                    System.out.println("시스템을 종료합니다.");
                    break systemout;
                default:
                    System.out.println("올바른 명령어를 입력하세요.");
            }

          // if문 활용
//            if (selected == 4) {
//                System.out.println("시스템을 종료합니다.");
//                break;
//            } else if (selected == 1) {
//                System.out.print("예금액 : ");
//                    money = scanner.nextInt();
//                    sum += money;
//            } else if (selected == 2) {
//                System.out.print("출금액 : ");
//                    money = scanner.nextInt();
//                    if ( sum - money < 0) {
//                        System.out.println("잔고가 마이너스가 되므로 초기 화면으로 돌아갑니다.");
//                        continue;
//                    }
//            } else if (selected == 3) {
//                System.out.printf("잔고 : %,d \n", sum);
//            } else {
//                System.out.println("올바른 명령어를 입력하세요.");
//            }
        }
    }
}
