package ex1.classex;

/*
Car 클래스 생성
    인스턴스 변수 : String ownername, int speed
    static 변수 : int cnt
 */
class Car{
    String ownername;
    int spped;
    static int cnt;

}


public class CarTest {
    public static void main(String[] args){
        Car one = new Car();
        one.ownername = "boo";
        one.spped = 100;

        Car two = new Car();
        two.ownername = "bang";
        two.spped = 200;

        System.out.println(one.ownername + "의 자동차 속도는 " + one.spped);
        System.out.println(two.ownername + "의 자동차의 속도는 " + two.spped);
    }
}

