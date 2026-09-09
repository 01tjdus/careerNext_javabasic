package ex7.inheritance;

class Employee{
    int empNo;
    String empName;

// 밑에 String을 주석처리 해도 오류가 안나는 이유?
// -> extends Object 자동 상속. 즉 Object클래스에 toString()이 있으므로
//    public String toString(){
//        return "이름 : " + empName + "\t사번 : " + empNo + "\t봉급 : ";
//    }
}

class Permanent extends Employee{
    int baseSalary; // 고정 급여
    double bonus = 0.5; // 보너스
}

public class SalarySystem {
    public static void main(String[] args){
        Permanent p1 = new Permanent();
        p1.empNo = 1;
        p1.empName= "Jennie";
        p1.baseSalary =500;
        System.out.println(p1);
    }
}
