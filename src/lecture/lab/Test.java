package lecture.lab;
class P {
    void m() {
        System.out.println("P");
    }
    void test(){    m();     }
}
class C extends P{
    void m() {
        System.out.println("Child");
    }
}
public class Test {
    public static void main(String[] args) {
        C one = new C();
        one.test();
    }
}
