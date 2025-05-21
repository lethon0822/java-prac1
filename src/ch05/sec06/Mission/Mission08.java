package ch05.sec06.Mission;

public class Mission08 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        int minNum = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i] < minNum)
                minNum = arr[i];
        }
        System.out.println(minNum);
    }
}
