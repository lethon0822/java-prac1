package ch05.sec06.Mission;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        int maxNum = arr[0];
        for (int i = 1; i<arr.length; i++){
            // 최대값보다 높은 값일 경우 그 값을 maxNum에 대입
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }
}
