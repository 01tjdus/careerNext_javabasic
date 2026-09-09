package lecture.ex1.classex;

class Robot{
    String name; //instance(멤버)변수
    int energy;   //instance(멤버)변수
    static int cnt ;  //  (멤버)변수
    void print() {
        //String name ="하하" ; // 지역변수
        System.out.println( name ); // 지역변수 에 없으면 멤버변수
    }
    static void print2(){
        System.out.println( cnt );
       // System.out.println( name );
        // 오류. STATIC method 에서는 객체.~ 없이 인스턴스변수나 인스턴스 메소드 사용 못함
        Robot r = new Robot();
        System.out.println(r.name);
    }
}
/* 어디에서 선언 되었는 지에 따라
지역변수 : 메소드 안에서 선언한 변수. (반드시, 초기화해야 함.)
멤버변수 : 클래스 안에서 선언한 변수. (자동 초기화.)
- instance(멤버)변수                              접근방법: 객체이름.instance변수
- static (멤버)변수  : static 키워드를 사용한 변수.  접근방법: 클래스이름.static변수
 */

class RobotTest {
    public static void main(String[] args) {
        // Robot 객체를 두개 만들고, 각각 값을 설정하고, 출력
        Robot one = new Robot();
        one.energy = 100;
        one.name ="kim";
        Robot.cnt = 1;  one.cnt = 1;  //static변수 둘다 가능
        // 클래스명.static변수명  <-- 권장

        System.out.println( one.energy );

        Robot two = new Robot();
        two.energy = 200;
        two.name = "lee";

        Robot.cnt = 2;  two.cnt = 2;  //static변수 둘다 가능
        System.out.println(one.cnt);

        one.print();
        two.print();

        float f = 3.14F;
    }
}
