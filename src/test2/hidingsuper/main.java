package test2.hidingsuper;
//Person 클래스: private String name 필드, getter, toString() 재정의("이름: OOO")를 작성하세요.
//Student가 Person을 상속받고,  int studentNo 필드를 추가하세요.
//Student의 toString()을 재정의하여 super.toString()을 활용해 "이름: OOO, 학번: 1234" 형태로 출력하세요.
//필드는 모두  생성자를 통해서만 초기화하세요.
//name은 반드시 super(name)으로 부모 생성자를 통해 설정합니다.
//toString() 재정의 시 super.toString()을 호출하면 부모의 로직을 재사용하면서 자식 정보만 덧붙일 수 있어 중복 코드를 줄입니다.

class Person {
    String name;
    int result ;
    public int getResult() {
        return result;
    }
    public String toString(){
        return "이름 : " + name ;
    }
}
class Student extends Person{
    int studentNo;
    public String toString(){
        return "이름 : " + name + "\t학번 : " + studentNo ;
    }
    void print(){
        System.out.println(super.toString());
    }
}


public class main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.studentNo = 12345678;
        s1.name = "Jennie";
        System.out.println(s1);
    }
}
