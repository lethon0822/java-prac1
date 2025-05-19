package ch05.sec06;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        /*
        사용 이유 : 같은 타입의 여러 값을 저장하기 위함.
        ex) 정수값 10개를 저장하려고 한다면 변수를 10개 선언하면서 각 변수를 선언할 때마다 이름을 할당해주어야 함.
            배열을 사용하면 매우 많은 변수 공간도 간단히 할당할 수 있음.

        1. 배열 변수 선언 : 타입[] 변수명;
        ex) int n1;     // 값을 저장할 수 있는 변수
            int[] arr1; // int 배열의 주소값 저장할 수 있는 변수

        2. 배열 생성 : new int[5]; // int 값을 저장할 수 있는 공간이 5개 생성

         */

        int[] arr1 = new int[10]; // 0 ~ 9
        // 쓰기
        arr1[0] = 10;
        arr1[5] = 100;
        // 읽기
        int num = arr1[0];
        System.out.println("num: " + num);
        System.out.println("arr[1]: " + arr1[1]);
        System.out.println("arr[2]: " + arr1[2]);
        System.out.println(Arrays.toString(arr1));

        for (int i=0; i<arr1.length; i++){
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }
    }
}
