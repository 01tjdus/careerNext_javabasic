package lecture.ex9.casting;
class Car{
    void run() {
        System.out.println("자동차 달림");
    }
}
class Sonata extends  Car {
    void run() {
        System.out.println("Sonata 달림");
    }
}
class Genesis extends  Car {
    void run() {
        System.out.println("Genesis 달림");
    }
    void autoPark(){
        System.out.println("Genesis autoPark");
    }
}
public class ObjectCastingEx {
    static void drive(Car c) {
        c.run();


        if ( c instanceof Genesis ) {
            // c.autoPark(); // 컴파일러는 객체 확인 못함.
            // c의 자료형인 Car에 autoPart()이 없어서 오류

            //((Genesis) c).autoPark();
            Genesis gg = (Genesis) c;
            gg.autoPark();
        }
    }
    public static void main(String[] args) {
         Genesis g = new Genesis();
         Sonata s = new Sonata();

         drive(g);
         drive(s);
    }
}
