package ex7.abstractex;
abstract class A{
}
abstract class Shape {//추상 메소드가 하나라도 있으면 반드시 추상 클래스이어야 함.
    abstract void draw();
}
class Circle extends Shape {
    void draw(){
        System.out.println("원그림");
    }
}

public class Test {
    public static void main(String[] args){
       // A a = new A(); //오류. 추상 클래스는 객체 생성 못함.
    }
}
