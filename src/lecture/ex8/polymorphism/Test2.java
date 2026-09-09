package lecture.ex8.polymorphism;
class Car{
    void run() {
        System.out.println("자동차 달림");
    }
}
class Sonata extends Car{
    void run() {
        System.out.println("Sonata 달림");
    }
}
class Genesis extends Car{
    void run() {
        System.out.println("Genesis 달림");
    }
}
public class Test2 {
    static void drive(Car c){
        c.run();
    }
    public static void main(String[] args) {
        drive(  new Sonata() );
        drive(  new Genesis() );
    }
}
