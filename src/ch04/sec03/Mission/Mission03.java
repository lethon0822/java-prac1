package ch04.sec03.Mission;

import java.lang.System;
import java.util.Scanner;

import static java.lang.System.in;


public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt();
        System.out.println("score: " + score);

        if (score > 100 || score < 0) {
            System.out.print("잘못된 점수입니다.");
        } else {
            int divideScore = score / 10;
            switch (divideScore) {
                case 10, 9:
                    System.out.print(score >= 98 ? "A+" : score >= 94 ? "A0" : "A-");
                    break;
                case 8:
                    System.out.print(score >= 88 ? "B+" : score >= 84 ? "B0" : "B-");
                    break;
                case 7:
                    System.out.print(score >= 78 ? "C+" : score >= 74 ? "C0" : "C-");
                    break;
                default:
                    System.out.print("D");
                    break;
            }
        }


        // 지민씨 코드
        /*
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수 입니다.");
        } else if (score == 100) {
            System.out.println("학점: A+");
        } else {
            String grade = "";
            int first = score / 10;

            switch (first) {
                case 9:
                    if (score >= 98) grade = "A+";
                    else if (score >= 94) grade = "A0";
                    else grade = "A-";
                    break;
                case 8:
                    if (score >= 88) grade = "B+";
                    else if (score >= 84) grade = "B0";
                    else grade = "B-";
                    break;
                case 7:
                    if (score >= 78) grade = "C+";
                    else if (score >= 74) grade = "C0";
                    else grade = "C-";
                    break;
                default:
                    grade = "D";
            }

             System.out.println("학점: " + grade);

         */


        // 선생님 코드
        /*
            String grade = "D";
        String sigh = "0";

        if(score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
            switch ( score / 10 ) {
                case 10, 9: grade = "A"; break;
                case 8: grade = "B"; break;
                case 7: grade = "C"; break;
            }

            int modResult = score % 10;
            if( score < 70 ) {
                sigh = "";
            } else if(score == 100 || modResult >= 8) {
                sigh = "+";
            } else if( modResult <= 3 ) {
                sigh = "-";
            }
            System.out.printf("%s%s\n", grade, sigh);
        }
        */
        }
    }
