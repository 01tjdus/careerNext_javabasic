package lecture.ex13.excetion;

public class ExceptionTest2 {
    static String str; // null 초기화
    public static void main(String[] args) {
        //String s = str.substring(1) ;

        int[] data = {10,20};
        data[0] = 10;
        data[2] = 20;
    }
}
