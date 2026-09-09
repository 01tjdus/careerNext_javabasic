package ex13.exception;

import java.io.FileReader;

public class ExceptionTest7 {
    public static void main(String[] args){
        try {
            throw new MyException();
        }catch (MyException e){
            throw new RuntimeException(e);
        }
    }
}

class MyException extends Exception{

}