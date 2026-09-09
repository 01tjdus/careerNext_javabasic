//package ex17;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//public class FileReaderTest {
//    public static void main(String[] args) {
//        FileReader fin = new FileReader("c:/bit/a.txt");
//        BufferedReader br = new BufferedReader(fin);
//        String line =""; //유니코드를 변환해서 읽어오므로 String으로 저장 가능
//        while((line = br.readLine() )!= null){
//            System.out.println("읽어온 데이터 : " + line);
//        }
//        br.close(); fin.close();
//    }
//}
