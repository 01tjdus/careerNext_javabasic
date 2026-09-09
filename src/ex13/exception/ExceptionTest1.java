package ex13.exception;

public class ExceptionTest1 {
    static String str; //null
    public static void main(String[] args){
        String s = str.substring(1);

        int [] data = {10,20};
        data[0] = 10;
        //data [2] = 20; //인덱스의 범위를 벗어남
    }
}
