package ch02.sec01;

public class VariableInitializitionExample {
    public static void main(String[] args) {
        // 변수 사용 방법 2가지 : 읽기(read), 쓰기(write)-변경(update)
        int value; // 변수 선언, 선언할 때 데이터 타입 지정, 한번만
        value = 10;

        /*
        에러 종류 크게 2가지
        1. 컴파일 에러 : 컴파일 자체가 불가능, 실행이 안됨, 문법적 문제가 있거나 명확한 문제가 보일 때
        2. 런타임 에러 : 실행을 하는 도중에 에러 발생
         */

        int result = value + 10; // 빨간색 언더라인, 컴파일 에러
        System.out.println(result);
    }
}
