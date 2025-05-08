//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

/*
    class 이름은 Pascal Case 로 작성.
    클래스라는 그릇에는 코드가 작성됨. (메소드-함수, 변수 등)
    클래스 이름은 파일 이름과 같아야 함.
    메인 메소드는 프로그램의 시작점이므로 매우 중요함.
    메소드를 만든다 ==> 메소드 정의
    메소드를 사용함 ==> 메소드 호출
    메소드가 호출되면 그 내용이 한줄씩 실행됨.
 */


public class Main {
    public static void main(String[] args) {    // 메소드(Method)

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 30; i++) {  // 반복문, loop

            System.out.println("i = " + i);
        }
    }
}