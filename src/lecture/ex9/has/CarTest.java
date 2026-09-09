package lecture.ex9.has;
class Car{
    void run () {
        System.out.println("car 달림");
    }
}
class Sonata extends Car{
    void run(){
        System.out.println("소나타 달림");
    }
}
class Genesis extends Car{
    void run(){
        System.out.println("Genesis 달림");
    }
}
class Person{
    Car car ;  //Person has a car.
    void drive(){
        car.run();
    }
}
public class CarTest {
    public static void main(String[] args) {
        Person sunhee = new Person();
        Person chulsu = new Person();
        Sonata s= new Sonata();
        Genesis g = new Genesis();

        sunhee.car = s;
        chulsu.car = g ;
        sunhee.drive();
        chulsu.drive();

        sunhee.car.run();
        chulsu.car.run();
    }
}
