package ch02;

public class PrintVsPrintln {
    public static void main(String[] args){
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println();
        System.out.println("---------------");

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        // print + 개행 (이스케이프 문자 "\n")
        System.out.print("안녕 \n");
        System.out.print("안녕 \\n");
        System.out.print("\"안녕 \n"); // 역슬래시를 사용해서 따옴표 등 기능이 있는 문자를 나오게 할 수 있음

        // printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f;
        double height2 = 172.5;
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm입니다.
        // 제 이름은 name이고 나이는 age살이며 키는 heightcm입니다.
        System.out.println("제 이름은 " + name +"이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다. \n", name, age, height); // C처럼

    }
}
