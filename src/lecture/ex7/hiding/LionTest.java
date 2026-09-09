package lecture.ex7.hiding;
class Animal{
    int id;
}
class Lion extends Animal{
    String id;
    void print(){
        System.out.println(id);
        System.out.println(super.id);
    }
}
public class LionTest {
    public static void main(String[] args) {
        Animal a1 =new Animal();
        a1.id = 10 ;
        Lion b1 = new Lion();
        b1.id = "문자data";
        b1.print();
    }
}
