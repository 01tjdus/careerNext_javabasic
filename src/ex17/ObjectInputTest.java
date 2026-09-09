package ex17;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputTest {
    public static void main(String[] args) throws Exception{
        ObjectInput oi = new ObjectInputStream(new FileInputStream("object.data"));
        String today = (String)oi.readObject();
        Date d = (Date) oi.readObject();
        double d2 = oi.readDouble();
        A a = (A) oi.readObject();
    }
}
