package ex14;

public class MathTest {
    public static void main(String[] args){
        //1,2,3, 중 하나를 랜덤으로 출력
        //1이면 가위, 2이면 보, 3이면 바위 출력
        int i = (int)(Math.random() * 3 +1);

        switch (i){
            case 1 : System.out.println("가위"); break;
            case 2 : System.out.println("바위"); break;
            case 3 : System.out.println("보"); break;

        }
    }
}