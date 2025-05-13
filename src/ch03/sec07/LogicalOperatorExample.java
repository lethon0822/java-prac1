package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;

        System.out.printf(" %d > %d : %b \n", num1, num2, num1>num2);
        System.out.printf(" 5 > 2 && 5 > 0 : %b \n", 5 > 2 && 5 > 0 );
        System.out.printf(" 5 > 2 && 5 < 0 && 10 > 2 : %b \n", 5 > 2 && 5 < 0 && 10 > 2 );
        // && (and) 연산자는 하나라도 false 면 결과가 false
        // 1) 5 > 0 ==> true
        // 2) 5 < 2 ==> false
        // 3) true && false >> false
        // false가 나와서 그 다음 연산 xx

        System.out.println();
        System.out.printf("5 > 2 || 5 > 0 : %b \n", 5 > 2 || 5 < 0 );
        System.out.printf("5 < 2 || 5 > 0 : %b \n", 5 < 2 || 5 < 0 );
        // || (or) 연산자는 하나라도 true 면 결과가 true
        // 1) 5 > 0 ==> true
        // true가 나와서 그 다음 연산 xx

        System.out.println();
        System.out.printf("!(5 < 2 || 5 < 0) : %b \n", !(5 < 2 || 5 < 0) );
        // ! (not) 연산자는 결과를 반대로
    }
}
