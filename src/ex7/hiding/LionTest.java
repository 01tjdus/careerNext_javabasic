package ex7.hiding;
class Animal{
    int id;
}

class Lion extends Animal{
    String id;
    void  print(){
        System.out.println(id);
        System.out.println(super.id); //은닉된 id
    }
}

public class LionTest {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.id = 10;
        Lion b1 = new Lion(); //부모에게 상속받은 id는 은닉되어 있음
        b1.id = "문자 data";
        b1.print();
    }
}
