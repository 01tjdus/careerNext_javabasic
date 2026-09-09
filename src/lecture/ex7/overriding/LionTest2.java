package lecture.ex7.overriding;
class Animal {
  void move(){
      System.out.println("animal 이 움직임");
  }
}
class Lion extends  Animal {
    void move(){ // 부모의 void move() 를 재정의
        System.out.println("Lion 이 움직임");
    }
    void auto(){
        super.move(); // // 부모의 void move() 호출
        move();
    }
}
public class LionTest2 {
    public static void main(String[] args) {
        Lion b1 = new Lion();
        b1.auto();
    }
}
