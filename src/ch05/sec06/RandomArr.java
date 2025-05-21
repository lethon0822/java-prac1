package ch05.sec06;

import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1; //1~9
            arr[i] = rVal;

            for(int z=0; z<i; z++) {
                if(arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}