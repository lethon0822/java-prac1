package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. (w/m) > ");
        String gender = scanner.next();
        System.out.println("gender: " + gender);
        
        switch (gender){
            case "w":
            case "W":
            case "여":
            case "여자":
                System.out.println("당신은 여자입니다.");
                break;
            case "m":
            case "M":
            case "남":
            case "남자":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println("올바른 데이터를 입력해주세요.");
        }
        scanner.close();

    }
}
