package ch04;

public class RandomNumber {
    public static void main(String[] args){
        System.out.printf("%.0f \n", Math.random()*100); // double return

        double value = 0.99999;
        double result = value * 10.0d; // 크기가 큰(용량) 쪽으로 자동 형변환
        System.out.println("result: " + result);

        int intResult = (int)result; // 강제 형변환, 명시적 형변환
        System.out.println("intResult: " + intResult);

        double value2 = 0.00002;
        System.out.println("value2: " + (int)(value2 * 10.0));
        System.out.println((int)(Math.random() * 10.0)); // 0 ~ 9
    }
}
