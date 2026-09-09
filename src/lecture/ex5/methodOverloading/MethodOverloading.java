package lecture.ex5.methodOverloading;

public class MethodOverloading {
    static int add(int i, int j){
        System.out.println( "add(int i, int j) 호출");
        return i+j;
    }
    static double add(double i, double j){
        System.out.println( "add(double i, double j) 호출");
        return i+j;
    }
    public static void main(String[] args) {
        int i=10, j = 20;
        double l1 = 10, l2=20;
        System.out.println(  add(i,j) ); //add(int i, int j) 호출
         System.out.println(  add(l1,l2) );//add(double i, double j) 호출
    }
}
