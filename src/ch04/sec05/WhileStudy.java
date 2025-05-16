package ch04.sec05;

public class WhileStudy {
    public static void main(String[] args) {
        // for loop : 몇 번 반복해야 하는지 정확히 알때
        // while loop : 언제 반복을 멈춰야 하는지 알 때
        /*
            조건식이 true인 동안 실행문을 반복
            while (조건식) { 실행문 }
        */

        for (int i = 0; i<10; i++){
            System.out.print(i);
        }

        int i = 0;
        while (i<10){
            System.out.print(i++);
        }

    }
}
