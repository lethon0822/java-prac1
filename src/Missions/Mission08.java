package Missions;

public class Mission08 {
    public static void main(String[] args){
        int sum = 0;

        // sum = sum + 1;
        // sum = sum + 2;
        // sum = sum + 3;

        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }

        System.out.println("sum: " + sum);  // 5050
    }
}
