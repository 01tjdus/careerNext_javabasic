package lecture.ex12;

interface Drawable{
   int PLAIN_PEN = 1; //public static final
   int BOLD_PEN = 2;
   void draw(); //public abstract
    void move(int x, int y);
}
interface Drawable2D extends Drawable {
}
class Bear implements Drawable{
    public void draw() {
    }
    public void move(int x, int y) {
    }
}

class Car{
    void run() {}
}
// @ anotation 주석 : 컴파일러와 실행환경에 전달하는 주석
/* */
class Sonata extends Car{
    @Override
    void run() {
        System.out.println("SONATA 달리");
    }
}



public class intefaceEx {
}
