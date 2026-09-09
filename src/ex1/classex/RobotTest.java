package ex1.classex;

class Robot{
    String name;
    int energy;
    static int cnt; // static (멤버) 변수

    void print() {  //메소드는 소괄호가 있고
        String name = "jennie"; // name은 지역 변수 (선언을 메소드 안에서 했으니까)
        System.out.println(name); // 지역 변수가 선언되면 jennie가 출력 되고 지역변수가 선언되어 있지 않으면 멤버 변수에 있는 값이 나옴(kim, lee)
    }
    static void print2(){
        System.out.println(cnt);
        // System.out.println(name); //오류 static method 에서는 객체.~ 없이 인스턴스 변수나 인스턴스 메소드 사용 못함.

        Robot r = new Robot();
        System.out.println(r.name); // r의 name
    }
}
/* 어디에서 선언 되었는지에 따라
지역 변수 : 메소드 안에서 선언한 변수 (반드시, 초기화 해야함.)
멤버변수 : 클래스 안에서 선언한 변수 (자동 초기화)
- instance : (멤버 변수)
- static : (멤버 변수) : static 키워드를 사용한 변수  메모리들끼리 공유 가
 */

public class RobotTest {
    public static void main(String[] args) {
        // 로봇 객체를 두개 만들고, 각각 값을 설정하고 출력
        Robot one = new Robot();
        one.energy = 100;
        one.name = "kim";
        Robot.cnt = 1; // one.cnt = 1; //둘다 static 변수 가능하나 후자는 별로 좋은 예시는 아님
        // 클래스명.static변수명 = ~~~~; 가 권장사항

        System.out.println(one.energy);

        Robot two = new Robot();
        two.energy = 200;
        two.name = "lee";

        Robot.cnt = 2; two.cnt = 2;
        System.out.println(one.cnt);  // 답 = 2 static 변수는 값은 하나인데 여러개로 관리할때 static 변수로 값을 지정해놓고 사용하면 됨 like 노트북 모델명

        one.print();
        two.print();

        float f_ = 3.14F;
    }
}
