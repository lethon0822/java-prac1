package ch05.sec06.Mission;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");

        System.out.print("[");
        for (int i = 0; i<arr.length; i++){
//            if (i == arr.length-1){
//                System.out.print(arr[i]);
//                break;
//            }
//            System.out.print(arr[i] +", ");

            // 이게 더 깔끔한듯
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }

//            if (i != 0) {
//                System.out.println(", ");
//            }
//            System.out.println(arr[i]); // 같은 결과, -1 처리를 안해도 됨
            // 한줄로 : System.out.println(arr[i] + (i < arr.lenth-1 ? ", ": ""));
            // 하지만 연산을 매번 하므로 따로 변수로 빼주는 것이 좋음
        }
        System.out.print("]");

        System.out.println("---------------");

        // 선생님 답안
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
    }
}
