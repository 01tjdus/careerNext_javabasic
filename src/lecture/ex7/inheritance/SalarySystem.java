package lecture.ex7.inheritance;

class Employee {
    int empNo;
    String empName;
// 주석 처리를 해도 System.out.println( p1.toString() )에서 오류가 안나는 이유는 ?
// -->extends Object 자동 상속. 즉, Object 클래스에 toStirng()이 있으므로
//    public String toString(){
//        return "이름 " + empName + "\t 사번" + empNo ;
//    }
}
class Permanet extends Employee{
    int baseSalary ;
    double bonus = 0.5;
}

public class SalarySystem {
    public static void main(String[] args) {
        Permanet p1 = new Permanet();
        p1.empNo = 1;
        p1.empName = "홍길동";
        p1.baseSalary = 500;
        System.out.println( p1 );
        // System.out.println( p1.toString() );
    }
}
