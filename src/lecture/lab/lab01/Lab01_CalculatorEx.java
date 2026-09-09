package lecture.lab.lab01;
class Calculator {
    double result ; 
    void add(double num) {       result = result + num; }
    void substract(double num) {  result = result - num;	 }
    void multiply(double num) {   result = result * num;	 }
    void divide(double num) {     result = result / num;	 }
    void print() {          System.out.println(result); } 
    void init() {           result = 0 ;	}
}
public class Lab01_CalculatorEx {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        cal1.add(1000); cal1.add(50); cal1.multiply(5.2);  
        cal1.divide(10);  cal1.print();
        
        cal2.add(90);
        cal2.multiply(1000);
        cal2.divide(30);
        cal2.substract(10);                     
        cal2.print();

    }
} 