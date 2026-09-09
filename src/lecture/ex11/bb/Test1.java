package lecture.ex11.bb;
import lecture.ex11.aa.Person1;

public class Test1 {
    public static void main(String[] args) {
        Person1 one = new Person1();
        //one.data2=10;
//Test1은 Person1과 동일 팩키지에 있는 클래스가 아니므로 컴파일 오류
    }
}
