package other;

public class ScopeStudy {
    public static void main(String[] args) {
        /*
        스코프 : 변수가 살아있는 범위
                선언되면 자기 자신을 감싸고 있는 가장 가까운 중괄호 안에서만 살아있음
                중괄호를 벗어난 범위에서는 기능을 못함(죽음)
        */

        int num = 10;
        System.out.println(num);

        for (int i=0; i <10; i++){
            System.out.println(i);
        }
        // 같은 스코프 안에서는 같은 이름의 변수 선언을 한번만 하면 됨.
        // System.out.println(i); // i에 접근 불가능해서 error

    }

    public static void methodA(){
        // System.out.println(num); // num에 접근 불가능해서 error
    }
}
