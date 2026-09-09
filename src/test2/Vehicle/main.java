package test2.Vehicle;
//Vehicle 클래스: brand(String), speed(int) 필드와 생성자, move() 메소드("~대가 달립니다" 출력)를 만드세요.
//Car 클래스가 Vehicle을 상속받고, doorCount(int) 필드를 추가하세요.
//Truck 클래스가 Vehicle을 상속받고, loadWeight(double) 필드를 추가하세요.
//main()에서 Car, Truck 객체를 각각 생성하여 정보를 출력하세요.
//자식 생성자에서 super(...)로 부모 생성자를 먼저 호출해야 하며, super() 호출은 반드시 생성자의 첫 줄이어야 합니다.


class Vehicle{
    String brand;
    int speed;
    void move(){
        System.out.println("Vehicle이 달립니다.");
    }
}

class Car extends Vehicle{
    int doorCount;
    void move(){
        System.out.println("Car가 달립니다.");
    }
    void auto(){
        super.move();
        move();
    }
}
class Truck extends Vehicle{
    double loadWeight;
    void move(){
        System.out.println("Truck이 달립니다.");
    }
    void auto(){
        super.move();
        move();
    }
}

public class main {
    public static void main(String[] args){
        Car c = new Car();
        c.move();
        Truck t = new Truck();
        t.move();
        System.out.println(c);
        System.out.println(t);
    }
}
