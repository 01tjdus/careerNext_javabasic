package lecture.ex13.excetion;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest7 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr1 = new FileReader("a.txt") ;
    }
}
