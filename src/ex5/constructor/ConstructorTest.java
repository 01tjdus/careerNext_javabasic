package ex5.constructor;
class Employee {
    String name;
    // 생성자, 객체 생성시 처리해야할 내용을 작성하면 됨.
    Employee(){
        System.out.println("생성자 호출됨");
    }
}

public class ConstructorTest {
    public static void main (String[] args){
        Employee me = new Employee();
    }
}
