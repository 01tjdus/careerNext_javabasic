package lecture.ex5.constructor;

class Emp{
    String name;
    static int cnt;
    Emp() {}
    Emp(String name){
        this.name = name;
        cnt = cnt + 1;
    }
}
public class ConstructorTest2 {
    public static void main(String[] args) {
        Emp me = new Emp("홍길동") ; // String 인자 생성자 호출
        System.out.println(me.name );
        System.out.println( Emp.cnt);
        Emp me1 = new Emp(); // 무인자 생성자 호출
    }
}
