package ch04.sec03.Mission;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 16.0);
        System.out.println(month + "월");

        switch(month) {
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당 계절이 없습니다.");
        }
    }
}
