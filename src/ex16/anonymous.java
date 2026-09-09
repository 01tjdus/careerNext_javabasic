package ex16;

interface I{
    void m();
}
class  A implements I{
    public void m(){
        System.out.println("A");
    }
}
public class anonymous {
    public static void main(String[] args) {
        I a1 = new A();
        a1.m();

        I a2 = new I() { //익명 클래스
            @Override
            public void m() {
                System.out.println("A");
            }
        };
        //만약 구현하고자 하는 인터페이스가 메소드가 하나면,
        // 그 메소드 정의 부분도 코딩 생략 가능 -> 자바 람다
        a2.m();
    }
}
