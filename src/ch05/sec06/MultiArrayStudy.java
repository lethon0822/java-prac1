package ch05.sec06;

public class MultiArrayStudy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[][] parent= {arr1, arr2};

        System.out.println(parent[1][1]);
        
        /*
        int[][][] parent2 = null; 2차원 배열을 여러개
        int[][][][] parent3 = null; 3차원 배열을 여러개
         */
    }
}
