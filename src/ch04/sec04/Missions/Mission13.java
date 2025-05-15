package ch04.sec04.Missions;

public class Mission13 {
    public static void main(String[] args){
        int star = (int)(Math.random() * 6.0) + 3;  // 3~8까지 랜덤
        for (int i = 1; i<=star; i++){
            for (int k = 0; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = star; i>0; i--){
            for (int k = i; k > 1 ; k--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
