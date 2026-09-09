package ex17;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("");
        int count = 0;
        byte[] buffer = new byte[1024];
        while (count != -1){
            count = fin.read(buffer);
            if (count != -1)System.out.write(buffer,0,count);// 0번째 위치해있는거 부터 카운트 한다
        }
        fin.close();

        System.out.println(97);
        System.out.write(97);
        //System.out.flush();
    }
}
