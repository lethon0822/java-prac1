package ch04.sec07;

public class BreakOuterExample {
    public static void main(String[] args){
        haha:   // 반복문에 레이블을 주어서 break시 모든 for문을 빠져나올 수 있게 함
        for (int i = 2 ; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if(j==5) {
                    break haha;
                }
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
