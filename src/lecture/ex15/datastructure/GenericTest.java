package lecture.ex15.datastructure;
import java.util.*;

class B{
    int i;
}

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<B> arr2 = new ArrayList<B>();
        //B클래스의 객체를 넣을 수 있는 ArrayList
        B b3 = new B();
        B b4 = new B();
        b3.i = 10;
        b4.i = 20;
        arr2.add(b3);
        arr2.add(b4);

        for (int i = 0; i < arr2.size(); i++) {
            B obj = arr2.get(i);       //downcasting 필요없음

            /* 제너릭타입<>를 안쓰면 downcasting 인
            B obj = (B)arr2.get(i) 로 써야 함. */
            System.out.println(obj.i);
        }
    }
}

