package test2.lab;
class P {
    void m() {
        System.out.println("P");
    }
    void test(){
        m();
    }
}
class C extends P{
    void m(){
        System.out.println("Child"); //인터페이스는 무조건 동적바인딩
    }
}

public class Test {
    public static void main(String[] args){
        C one = new C();
        one.test();
    }
}
