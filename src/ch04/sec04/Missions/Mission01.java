package ch04.sec04.Missions;

public class Mission01 {
    public static void main(String[] args){

        // 5 ~ 10 사이 랜덤값 나오도록
        // n을 곱했을 때, 0 ~ n-1 값이 나오는 것을 응용
        // 최소값을 0보다 더 큰값을 하고 싶다면 해당 값을 더해야함.

        // (1) Math.random()은 double값을 변환하기 때문에 연산 시 double 값을 return
        // (2) 0.7 * 6 ==> 0.7 * 6.0 으로 자동 형변환
        // (3) 0.7 * 6.0 ==> 4.2
        // (4) 4.2 + 5 ==> 4.2 + 5.0로 자동 형변환
        // (5) 4.2 + 5.0 ==> 9.2
        // (6) (int)9.2 ==> 9 으로 정수 타입으로 강제 형변환

        // (1) Math.random()은 double값을 변환하기 때문에 연산 시 double 값을 return
        // (2) 0.7 * 6.0 ==> 4.2
        // (3) (int)4.2 ==> 4 으로 정수 타입으로 강제 형변환
        // (4) 4 + 5 ==> 9

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
