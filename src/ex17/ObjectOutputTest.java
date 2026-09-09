package ex17;

import java.io.*;

public class ObjectOutputTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("object.dat"));
        oo.writeObject("Today");
        oo.writeObject(new java.util.Date());
        oo.writeDouble(Math.PI);
        oo.flush();
        oo.close();
    }
}
class A implements Serializable{
    int i;
}

