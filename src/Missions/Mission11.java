package Missions;

public class Mission11 {
    public static void main(String[] args) {
        // 2~9단 구구단 출력 (단수가 바뀔 때 개행)

        for (int i = 2; i<10; i++){
            for(int k = 1; k<10; k++){
                System.out.printf("%d x %d = %d\n", i, k, i * k);
            }
            System.out.println();
        }
    }
}
