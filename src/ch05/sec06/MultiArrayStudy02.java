package ch05.sec06;

public class MultiArrayStudy02 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70}
        };
        /*
        System.out.println(arr.length); // 2
        System.out.println(arr[0].length); // 3
        System.out.println(arr[2].length); // 1
        */

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
