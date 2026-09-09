package ex5.constructor;
class TV{
    TV(){
        this(10);// 첫 문장에만 가능
        //this (20); //오류
    }
    TV(int c){
        System.out.println(c);
    }
}

public class TVTest {
    public static void main(String[] args){
        TV one = new TV();
    }
}
