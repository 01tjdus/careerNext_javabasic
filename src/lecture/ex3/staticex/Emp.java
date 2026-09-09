package lecture.ex3.staticex;

public class Emp {
    int empno = 0 ; // instance member variable
    static void print () {
        //System.out.println( empno ); // 오류

        m1();
       // m2();// 오류

        Emp one = new Emp();
        System.out.println(one.empno );
        one.m2();
    }
    static void m1() {
        System.out.println("m1");
    }
    void m2() {
        System.out.println("m2");
    }
}
