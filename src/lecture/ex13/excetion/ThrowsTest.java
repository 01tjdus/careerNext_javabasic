package lecture.ex13.excetion;

public class ThrowsTest {
    static void m1() throws Exception{
        m2();
    }
    static void m2() throws Exception{
        int i =0;
        int r = 10/i;
    }
    public static void main(String[] args)  {
//        try{
           // m1();
//        }catch (Exception e){
//            System.out.println( "예외발생");
//        }
        System.out.println(" 종료 ");
    }
}
