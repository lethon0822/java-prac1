package ch04.sec04.Missions;

public class Mission10 {
    public static void main(String[] args){
        int star = (int)(Math.random() * 4.0) + 3; // 3~6 랜덤값

        for (int i = 0; i < star; i++) {
            for (int k = 0; k < star; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int totalCount = star * star;
        for (int i = 1; i <= totalCount; i++) {
            System.out.print("*");

            // 배수만큼 나누기
            if (i % star == 0){
                System.out.println();
            }
        }
    }
}
