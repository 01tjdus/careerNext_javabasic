package lecture.ex1.classex;
/*
Car 클래스 생성
 인스턴스 변수 : String  ownername, int  speed
 static 변수 : int cnt
 */
class Car{
    String  ownername ;
    int  speed ;
    static int cnt ;
}
public class CarTest {
    public static void main(String[] args) {
         Car mycar = new Car();
         Car yourcar = new Car();
         mycar.ownername ="lee";
         mycar.speed = 100;
         yourcar.ownername ="홍길동";
         yourcar.speed = 0;
        System.out.println( mycar.ownername +"의 자동차 속도는 " + mycar.speed );
        System.out.println( yourcar.ownername +"의 자동차 속도는 " + yourcar.speed );
    }
}
