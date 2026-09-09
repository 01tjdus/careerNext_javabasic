package ex3.staticex;
class Employee {
    static int cnt;
    static void print(){
        System.out.println(cnt);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee.cnt = 1;
        Employee.print();
        test();
    }
    static void test() {
        System.out.println("test");
    }
}
