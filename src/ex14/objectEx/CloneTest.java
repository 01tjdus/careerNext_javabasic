package ex14.objectEx;
//java.lang 패키지는 import 안해도 됨.
//import java.lang.Cloneable

//Cloneable 인터페이스 같은 경우에는 추상메소드가 없음.
//-> 이런경우 flag 인터페이스 라고 부름(표식만 해주는 역할)

class Card extends Object implements Cloneable{
    int id;

    // Object 의 clone() 재정의 (Object 의 clone()은 protected)
    // 재정의 시, 접근 제한자는 동일하거나 더 넓은 범위의 접근 제한자(private -> public)는 가능
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //부모 클래스의 object를 호출한 후 예외처리도 필요
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Card one = new Card();
        one.id = 54321;
        Card two =(Card)one.clone(); //Cloneable 하위만 복제 가능
        System.out.println(two.id);

        Card three = one; // =과 clone은 다름
        one.id = 123456;
        System.out.println(two.id);//54321
        System.out.println(three.id); //123456
        System.out.println(one.id); //123456
    }
}
