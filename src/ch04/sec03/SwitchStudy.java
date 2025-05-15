package ch04.sec03;

public class SwitchStudy {
    public static void main(String[] args){
        for (int i=0; i <10; i++){
            int sum = 0; // 다른 이름의 변수 생성 가능
            System.out.println(i);
            /*
            오로지 equal만 가능
            switch:
                나머지 처리;
                break;
            case 값1;
                처리1;
                break;
            case 값2;
                처리2;
                break;
            case 값3;
                처리3;
                break;
            ...
            default
             */

            int num = 2;

            switch(num){
                case 1:
                    System.out.println("1입니다.");
                case 2:
                case 3:
                    System.out.println("2 or 3 입니다.");
                    break;
                case 4:
                    System.out.println("4입니다.");
                    break;
                default:
                    System.out.println("값이 없네요.");
            }
        }
    }
}
