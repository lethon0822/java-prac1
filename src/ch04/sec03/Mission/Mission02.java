package ch04.sec03.Mission;

public class Mission02 {
    public static void main(String[] args){
        int score = (int)(Math.random() * 116.0);
        System.out.print("score: " + score + "  학점 : ");
        score = (int) (score / 10.0);
        if(score > 100 || score < 0) {
            System.out.println("측정불가");
        } else {
            switch (score) {
                case 6, 5, 4, 3, 2, 1, 0:
                    System.out.print("D");
                    break;
                case 7:
                    System.out.print("C");
                    break;
                case 8:
                    System.out.print("B");
                    break;
                case 9, 10:
                    System.out.print("A");
                    break;
                default:
                    System.out.print("측정 불가");
            }
        }
    }
}
