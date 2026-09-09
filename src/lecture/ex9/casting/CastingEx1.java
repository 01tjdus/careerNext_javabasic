package lecture.ex9.casting;

public class CastingEx1 {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;  //묵시적 형변환

        b =(byte)s ;  // 명시적 형변환 해야함.

        double d2 = 0.3;
        float f = 0.3F ; // default 로 실수는 double 형

        f = (float) d2; // 명시적 형변환 해야함.

    }
}
