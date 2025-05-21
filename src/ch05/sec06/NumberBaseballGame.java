package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        int[] answerArr = new int[3];

        for(int i=0; i<answerArr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1; //1~9
            answerArr[i] = rVal;

            for(int z=0; z<i; z++) {
                if(answerArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answerArr));

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자 %d개를 입력> ", answerArr.length);
            String input = scanner.nextLine();
            //System.out.println("input: " + input);
            String[] inputStrArr = input.split("");
            if(inputStrArr.length != answerArr.length) {
                continue;
            }
            int[] inputArr = new int[answerArr.length];
            for(int i=0; i<inputArr.length; i++) {
                inputArr[i] = Integer.parseInt(inputStrArr[i]);
            }
            //System.out.println(Arrays.toString(inputArr));
            int s = 0, b = 0;
            for(int i=0; i<answerArr.length; i++) {
                for(int k=0; k<answerArr.length; k++) {
                    if(answerArr[i] == inputArr[k]) {
                        if(i == k) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            if(s == answerArr.length) {
                break;
            }
            System.out.printf("S: %d, B: %d, O: %d\n"
                    , s, b, answerArr.length - s - b);
        }
        System.out.println("-- 끝 --");
    }
}