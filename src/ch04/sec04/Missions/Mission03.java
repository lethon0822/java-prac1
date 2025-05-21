package ch04.sec04.Missions;

public class Mission03 {
    public static void main(String[] args){
        int value = (int)(Math.random() * 100) + 1;
        // 1~100 사이의 랜덤값 나오도록
        // 출력 : 짝수인지 홀수인지 점검하도록
        // ex) ~(은)는 홀수입니다.

        // 1번 (본인)
        if (value % 2 == 0) {
            System.out.println(value + "(은)는 짝수입니다.");
        }
        else if (value % 2 == 1) {
            System.out.println(value + "(은)는 홀수입니다.");
        }

        // 2번
        String oddEven = "홀";
        if (value % 2 == 0) {
            oddEven = "짝";
        }
        System.out.printf("%d는 %s 수입니다. \n", value, oddEven);

        // 3번
        System.out.printf("%d은 %s 수입니다.", value, value % 2 == 0 ? "짝" : "홀");
    }
}
