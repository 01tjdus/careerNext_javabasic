package lecture.ex7.inheritance.constructor;

class A{
   A(){
       System.out.println(" A() 생성자 ");
   }
}
class B extends  A{
    B(){
        // super(); // 부모 무인자 생성자 호출
    }
}
public class Test {
    public static void main(String[] args) {
        B b = new B();

    }
}
