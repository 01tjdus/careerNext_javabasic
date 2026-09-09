package ex12;

import java.io.CharArrayReader;

interface Drawable{
    int PLAIN_PEN = 1;  //public static final 자동 생성 생략 가능
    int BOLD_PEN = 2;
    void draw();
    void move (int x, int y);
}
interface Drawable2D extends Drawable{
}
class Bear implements Drawable{
    @Override  //컴파일러와 실행환경에 전달하는 주석
    public void draw() {
    }
    @Override
    public void move(int x, int y) {

    }
}
class Car {
    void run(){
    }
}
class Sonata extends Car{
    @Override
    void run() {
        System.out.println("sonata runs");
    }
}
public class interfaceEx {
}
