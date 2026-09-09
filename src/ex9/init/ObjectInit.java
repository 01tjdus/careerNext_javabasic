package ex9.init;

class Emp{
    int empNo = 0;

    Emp(int empNo){
        this.empNo = empNo;
        System.out.println("Emp(int empNo");
    }
    Emp(){
        System.out.println("Emp()");
        empNo=99;
    }
}

public class ObjectInit {
    public static void main(String[] args){
        Emp one = new Emp();
        System.out.println(one.empNo);

        Emp two = new Emp(10);
        System.out.println(two.empNo);
    }
}
