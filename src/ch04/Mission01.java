package ch04;

public class Mission01 {
    public static void main(String[] args){

        // 5 ~ 10 사이 랜덤값 나오도록
        for (int i = 0; i < 1000; i++) {
            int result = (int)(Math.random() * 6.0) + 5; // 0 ~ 5 에서 +5
            if (result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;
            }
        }
        System.out.println("--끝--");
    }
}
