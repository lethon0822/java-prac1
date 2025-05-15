package ch04.sec03.Mission;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        while (true) {  // 반복문 이용
            Scanner scanner = new Scanner(System.in);
            System.out.print("성별을 입력해주세요. (w/m) > ");
            String gender = scanner.next();

            if ("w".equalsIgnoreCase(gender)    // null이 들어갈 시 error 발생 안하는 쪽
                    || "여".equals(gender) || "여자".equals(gender)) {
                System.out.println("당신은 여성입니다.");
                break;
            }
            else if ("m".equalsIgnoreCase(gender)
                    || "남".equals(gender) || "남자".equals(gender)) {
                System.out.println("당신은 남성입니다.");
                break;
            }
            else {
                System.out.println("올바른 데이터를 입력해주세요.");
            }
        }
    }
}
