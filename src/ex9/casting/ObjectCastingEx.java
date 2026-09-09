package ex9.casting;

class Car{
    void run(){
        System.out.println("자동차 달림");
    }
}
class Sonata extends Car {
    void run() {
        System.out.println("소나타 달림");
    }
}
class Genesis extends Car {
    void run(){
        System.out.println("제네시스 달림");
    }
    void autoPark(){
        System.out.println("Genesis autoPark");
    }
}


public class ObjectCastingEx {
    static public void drive(Car c){
        c.run();
        if (c instanceof Genesis){
            Genesis gg = (Genesis) c;
            gg.autoPark();
        }
    }
    public static void main(String[] args){
        Genesis g = new Genesis();
        Sonata s = new Sonata();

        drive(g);
        drive(s);
    }
}
