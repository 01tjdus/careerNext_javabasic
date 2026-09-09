package lecture.lab.lab01;
class Calculator2 {
    double result ;
    Calculator2 add(double num) {
        result = result + num;
        return this;
    }
    Calculator2 substract(double num) {
        result = result - num;
        return this;
    }
    Calculator2 multiply(double num) {
        result = result * num;
        return this;
    }
    Calculator2 divide(double num) {
        result = result / num;
        return this;
    }
    void print() {
        System.out.println(result);
    }
    void init() {
        result = 0 ;
    }
}
public class Lab01_CalculatorEx2 {
    public static void main(String[] args) {
        Calculator2 cal1 = new Calculator2();
        Calculator2 cal2 = new Calculator2();

        cal1.add(1000).add(50).multiply(5.2).divide(10).print();
        cal2.add(90).multiply(1000) .divide(30) .substract(10).print();

    }
} 