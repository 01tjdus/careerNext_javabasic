package ex5.constructor;
class Emp {
    String name;
    static int cnt;

    Emp(String name) {
        this.name = name;
        cnt = cnt + 1;
    }
}

public class ConstructorTest2 {
    public static void main(String[] args){
        Emp me = new Emp("홍길동");
        System.out.print( me.name); // 홍길동
        System.out.print(Emp.cnt);   // 1\
        // Emp me1 = new Emp();
    }
}
