package ch04;

public class Mission04 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 201.0); // 0 ~ 200사이의 랜덤값

        String grade = "A";

        // 100 ~ 90점 사이 ==> A
        // 89 ~ 80점 사이 ==> B
        // 79 ~ 70점 사이 ==> C
        // 70점 미만 ==> D
        // 100점 초과거나 0점 아래 ==> 측정 불가

        // 1번 (본인)
        if ( score <= 100 && score >= 90 ) {}
        else if (score <= 89 && score > 80) {
            grade = "B";
        } else if (score <= 79 && score > 70) {
            grade = "C";
        } else if (score < 70) {
            grade = "D";
        } else if (score > 100 || score < 0) {
            grade = "측정 불가";
        }
        System.out.printf("성적 : %d, 등급 : %s \n", score, grade);
        System.out.println("-- 끝 --");


        // 2번
        // 위에서 이걸 거치면 max 값은 100이라는 뜻으로 걸러지기 때문에 맨 위에 둬도 괜찮음
        if ( score > 100 || score < 0 ) {
            grade = "측정 불가";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score < 70) {
            grade = "D";
        }
        
        if (grade == "측정 불가") {
            System.out.println(grade);
        } else {
            System.out.println(grade + "학점");
        }

    }
}
