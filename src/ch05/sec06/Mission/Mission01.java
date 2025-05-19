package ch05.sec06.Mission;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i<arr.length; i++){
            arr[i] = (i+1) * 100;
        }
        System.out.println(Arrays.toString(arr));
    }
}
