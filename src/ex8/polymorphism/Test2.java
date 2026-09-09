package ex8.polymorphism;

class Car{
    void run(){
        System.out.println("자동차 달림");
    }
}
class Sonata extends Car{
    void run() {
        System.out.println("소나타 달림");
    }
}
class Genesis extends Car{
    void run() {
        System.out.println("제네시스 달림");
    }
}

public class Test2 {
    static void drive(Car c){
        c.run();
    }
    public static void main(String[] args){
        drive(new Sonata());
        drive(new Genesis());
    }
}
