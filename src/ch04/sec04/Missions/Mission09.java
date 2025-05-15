package ch04.sec04.Missions;

public class Mission09 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2;

        // 랜덤 값에 대한 구구단을 출력
        for (int i = 1; i <=9; i++){
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }

        System.out.println("--------------");

        for (int i = 1; i<=9; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }

    }
}
