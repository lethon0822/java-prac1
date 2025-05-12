package ch04.sec04;

public class ForStudy {
    /*
            인덱스 초기화 : 인덱스 반복을 몇 번 할지 기준값
            조건식 : 인덱스 값을 비교하여 Go 할지 Die 할지 결정
            실행문 : 반복 실행하고 싶은 내용
            인덱스 증감식 : 인덱스 값을 증가하거나 감소시키기
            0~3번 모두 필수 작성은 아님.
            for (0:인덱스 초기화; 1: 조건식; 3:인덱스 증감식){
                2.실행문
            }
            실행 순서 (0번은 최초 1번만 실행)
                0 > 1 > 2 > 3
                    1 > 2 > 3
                    ... (1번 조건식이 false가 될 때 for문을 빠져나옴)
     */
    public static void main (String[] args){
        int i1 = 0;
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++);
        System.out.printf("i1: %d \n", i1++); // 이런 식으로 반복되는 걸 자동으로 하게
        // 위 아래, 동일함
        for (int i2 = 0; i2 < 7; i2++) {
            System.out.println(i2);
        }

    }
}
