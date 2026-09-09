package lecture.ex14.objectEx;
//import java.lang.Cloneable;
// java.lang 이 팩키지는 import 안해도 됨

// Cloneable 인터페이스 같은 경우는 추상메소드가 없다.
// flag 인터페이스 (표식만 해주는 역할)
class Card extends Object implements Cloneable
{
    int id ;

    // Object 의 clone() 재정의 ( Object 의 clone()은 protected )
    // 재정의 시, 접근제한자는 동일하거나 더 넓은 범위의 접근제한자는 가능
    public Object clone() throws CloneNotSupportedException {
       return super.clone() ;
    }
}
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Card one = new Card();
        one.id = 43242;
        Card two = (Card)one.clone(); //Cloneable 하위만 복제 가능
        System.out.println(two.id);

        Card three = one;
        one.id = 1111;
        System.out.println(two.id);   //43242
        System.out.println(one.id);   // 11111
        System.out.println(three.id);  // 11111

    }
}
