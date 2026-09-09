package ex7.inheritance.constructor;

class A3{
    A3(int i){
    }
}
class B3 extends A3{ // 부모에 무인자 생성자가 없기 떄문에 에러
    B3(int i){
        super(i);
    }
}

public class Test3 {
}
