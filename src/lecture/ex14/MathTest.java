package lecture.ex14;

public class MathTest {
    public static void main(String[] args) {
        // 1, 2, 3 중 하나를 랜덤으로 출력하는 코드
        // Math.random()  //  0.0 ~ 0.9999... (1.0 미만)
        // Math.random() * 3  //    →  0.0 ~ 2.9999...
        int i = (int)(Math.random() * 3) +1 ; // 1, 2, 3
        switch (i){
            case 1 :  System.out.println("가위"); break;
            case 2 :  System.out.println("바위"); break;
            case 3 :  System.out.println("보"); break;
        }
        // 1이면 가위 출력
        // 2이면 바위 출력
        // 3이면 보  출력
    }
}
