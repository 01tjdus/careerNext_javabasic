package lecture.ex13.excetion;

public class ExceptionTest8 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyException extends  Exception{

}
