package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args){
        int x = 3, y = 5;
        System.out.println("x: " + x + ", y: " + y);

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + ", y: " + y);
    }
}
