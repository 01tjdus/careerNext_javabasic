package lecture.ex4.thisex;
class Car{
    String id;
    int speed;

    public void setSpeed(int speed){
        this.speed = speed ;
       // 인스턴스 멤버 변수 speed = 지역변수 speed
    }
    public void run(){
        System.out.println(this.speed +" 의 속도로 달립니다.");
             // 인스턴스 멤버 변수
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();
        myCar.setSpeed(10);
        myCar.run();
        yourCar.setSpeed(5);
        yourCar.run();
    }
}
