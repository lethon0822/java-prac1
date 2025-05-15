package ch04.sec03;

public class StringEqualStudy {
    public static void main(String[] args) {
        // 중요, 자바에서 별로인 부분

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.printf("%s == %S : %b\n", str1, str2, str1==str2);
        System.out.printf("%s == %S : %b\n", str1, str2, str1.equals(str2)); // 문자열 비교는 equals
        System.out.printf("%s == %S : %b\n", str1, str2, str2.equals(str1)); // 순서 상관 x

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.printf("%s == %S : %b\n", str3, str4, str3==str4);
        System.out.printf("%s == %S : %b\n", str3, str4, str3.equals(str4));
        System.out.printf("%s == %S : %b\n", str3, str4, str4.equals(str3));
    }
}
