package ex9.casting;

public class CastingEx1 {
    public static void main(String[] args){
        byte b = 10;
        short s = b;

        b = (byte)s;

        double d2 = 0.3;
        float f = 0.3F;

        f = (float) d2;  // 명시적으로 형변환 해야함.
    }
}
