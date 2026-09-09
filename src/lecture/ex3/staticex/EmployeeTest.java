package lecture.ex3.staticex;
class Employee{
    static int cnt;
    static void print(){
        System.out.println(cnt);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee.cnt = 1 ;
        Employee.print();
        test();
        //static 메소드 안에서는 (객체변수.~ 없이)
        //instance 변수나 instance 메소드 사용 못함.
    }
    static void test(){
        System.out.println("test");
    }
}
