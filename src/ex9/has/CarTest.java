package ex9.has;
class Car{
    void run(){
        System.out.println("car가 달린다.");
    }
}

class Sonata extends Car{
    void run(){
        System.out.println("소나타가 달린다");
    }
}
class Genesis extends Car{
    void run(){
        System.out.println("Genesis is run");
    }
}
class Person{   // Person   has-a    Car    :  Has-a 관계
    Car car;
    void drive(){
        car.run();
    }
}
public class CarTest {
    public static void main(String[] args){
        Person sunhee = new Person();
        Person chulsu = new Person();

        Sonata s = new Sonata();
        Genesis g = new Genesis();

        sunhee.car = s;
        chulsu.car = g;

        sunhee.drive();
        chulsu.drive();

        sunhee.car.run();
        chulsu.car.run();
    }
}
