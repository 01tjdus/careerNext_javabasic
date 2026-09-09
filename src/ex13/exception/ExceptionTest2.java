package ex13.exception;


public class ExceptionTest2 {
    public static void main(String[] args){
        try {
            int i = 0;
            int result = 10 / i; //예외 발생(0으로 나눌수 없음)
            System.out.println(result);// 따라서 수행 못함
        } catch (Exception e){  // 예외가 발생할 경우 실행
            System.out.println("예외 발생");
        }
        System.out.println("종료");
    }
}
