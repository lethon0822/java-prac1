package ch04.sec04.Missions;

public class Mission12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int k = 2; k <= 9; k++){
                System.out.printf("%d x %d = %d \t", k, i, k * i);
            }
            System.out.println();
        }

    }
}
