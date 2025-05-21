package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        int[] answerArr = new int[3];

        // answerArr의 길이만큼 랜덤값을 받아 배열 칸마다 넣기
        for(int i=0; i<answerArr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1; //1~9
            answerArr[i] = rVal;

            // i가 0일때 작동하지 않음
            // 같은 값이 들어오려고 할 때 다른 값으로 덮어쓸 수 있게
            for(int  j=0; j<i; j++) {
                if(answerArr[j] == rVal) {
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

            // 한글자씩 떼서 배열에 담기
            String[] inputStrArr = input.split("");

            // 담았는데 배열의 길이가 답의 길이와 다르면 while문을 처음부터 다시
            if(inputStrArr.length != answerArr.length) {
                continue;
            }

            int[] inputArr = new int[answerArr.length];

            for(int i=0; i<inputArr.length; i++) {
                inputArr[i] = Integer.parseInt(inputStrArr[i]);
            }

            //System.out.println(Arrays.toString(inputArr));
            
            // 비교했을 때 값이 같은 경우 b, 배열의 자리값까지 같은 경우 s를 증가
            int s = 0, b = 0;
            for(int i=0; i<answerArr.length; i++) {
                for(int j=0; j<answerArr.length; j++) {
                    if(answerArr[i] == inputArr[j]) {
                        if(i == j) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            
            // 자리가 모두 같으면 정답이므로 while문을 빠져나감
            if(s == answerArr.length) {
                break;
            }
            
            // 자리가 모두 같지는 않을 시 현재 상황 보여주기
            System.out.printf("S: %d, B: %d, O: %d\n"
                    , s, b, answerArr.length - s - b);
        }

        System.out.println("-- 끝 --");
    }
}