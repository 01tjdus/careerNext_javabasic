package lecture.ex15.datastructure;

class Box1 {
   Object content;  //content에 자바의 모든 객체를 담고 싶을 때
    public Object getContent() {
        return content;
    }
}
class Box2<A> {
    A content;  //content에 자바의 모든 객체를 담고 싶을 때
    public A getContent() {
        return content;
    }
}
public class Box{
    public static void main(String[] args) {
        Box2<String> b = new Box2();
        b.content = "aa";
        System.out.println(b.getContent());
        Box2<Integer> a = new Box2<Integer>();
        a.content = 1;
    }
}
