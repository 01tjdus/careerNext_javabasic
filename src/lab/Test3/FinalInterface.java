package lab.Test3;
//인터페이스 Payable을 선언하고, 상수 double TAX_RATE = 0.1 (자동 public static final)과 추상메소드 double calculatePay()를 정의하세요.
//Employee 클래스가 Payable을 구현(implements)하고, baseSalary 필드를 이용해 세후 급여를 계산하세요.
//Employee에 final 메소드 printCompany()를 만들어 하위 클래스가 재정의할 수 없게 하세요.
//여러 Employee를 Payable[] 배열에 담아 순회하며 calculatePay()를 호출하세요.
//인터페이스의 필드는 선언만 해도 자동으로 public static final(상수)이 되고, 메소드는 자동으로 public abstract가 됩니다.
//final 메소드(printCompany)는 하위 클래스에서 재정의(오버라이딩)하면 컴파일 오류가 발생합니다.

//interface Payable{
//    double TAX_RATE = 0.1;
//    double calculatePay();
//}
//class Employee implements Payable{
//    private String name;
//    private double baseSalary;
//
//    public Employee(name, baseSalary){
//        this.name = "Jennie";
//        this.baseSalary = "1000"
//    }
//    private double calculatePay() {
//        return calculatePay();
//    }
//    public  static void printCompany(){
//        System.out.println("회사 이름 : 리센느");
//    }
//    public String getName() {return name;}
//}
//
//public class FinalInterface {
//    public static void main(String[] args){
//        Payable[] list = {
//                new Employee("김철수", 3000000),
//                new Employee("홍길동",60000000),
//                new Employee("야르렁",34567890)
//        };
//        for (p:list) {
//            System.out.println(p.);
//        }
//    }
