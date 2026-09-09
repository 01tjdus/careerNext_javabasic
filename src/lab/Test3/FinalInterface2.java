package lab.Test3;

interface Payable {
    double TAX_RATE = 0.1;          // 자동 public static final
    double calculatePay();          // 자동 public abstract
}

class Employee implements Payable {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {   // 타입 명시
        this.name = name;                               // 매개변수 대입
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePay() {                      // public 필수
        return baseSalary * (1 - TAX_RATE);             // 세후 급여
    }

    public final void printCompany() {                  // static이 아니라 final
        System.out.println("회사 이름 : 리센느");
    }

    public String getName() { return name; }
}

public class FinalInterface2 {
    public static void main(String[] args) {
        Payable[] list = {
                new Employee("김철수", 3000000),
                new Employee("홍길동", 60000000),
                new Employee("야르렁", 34567890)
        };

        for (Payable p : list) {                        // 변수 타입 명시
            System.out.println(((Employee) p).getName() + " 세후 급여 : " + p.calculatePay());
        }

        new Employee("사원", 0).printCompany();
    }
}
