package ex11.bb;

import ex11.aa.Person2;

public class Child extends Person2 {
    void m(){
        // data2 = 10;
        //Child는 Person2와 동일팩키지에 있는 클래스가아니므로 컴파일오류

        data3 = 10;
        //패키지가 달라도, Child는 Person2의 하위 클래스이므로 접근 가능
    }
}
