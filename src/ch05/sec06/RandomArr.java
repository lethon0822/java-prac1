package ch05.sec06;

import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1; //1~9
            arr[i] = rVal;

            // i가 0일때 작동x
            for(int j=0; j < i; j++) {
                if(arr[j] == rVal) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}