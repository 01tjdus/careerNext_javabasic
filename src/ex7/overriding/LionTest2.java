package ex7.overriding;
class Animal{
    void move(){
        System.out.println("Aniaml이 움직임");
    }
}

class Lion extends Animal{
    void move(){
        System.out.println("Lion이 움직임");
    }
    void auto(){
        super.move(); //부모의 move 메소드
        move();
    }
}



public class LionTest2 {
    public static void main (String[] args){
        Lion b1 = new Lion();
        b1.auto();
    }
}
