package ch05.sec06.Mission;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // for문 두개 사용
        // 쓰기용 for 문
        for (int i = 0; i <arr.length; i++){
            arr[i] = 10 + i;
        }

        // 읽기용 for문
        for (int i = 0; i <arr.length; i++){
            System.out.printf("arr[%d] : %d \n", i, arr[i]);
        }
    }
}
