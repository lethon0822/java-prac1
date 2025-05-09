package ch02.sec01;

public class Mission01 {
    public static void main(String[] args){
        int num1 = 11;
        int num2 = 22;

        // 문자열이 섞여있어 정수가 모두 문자열로 자동 형변환.
        System.out.println("num: " + num1 + num2); // 1122
        // (1) "num: " + num1
        // (2) "num: " + 11
        // (3) "num: " + "11"
        // (4) "num: 11"
        // (5) "num: 11" + num2
        // (6) "num: 11" + 22
        // (7) "num: 11" + "22"
        // (8) "num: 1122"

        System.out.println("num: " + (num1 + num2)); // 33
    }
}
