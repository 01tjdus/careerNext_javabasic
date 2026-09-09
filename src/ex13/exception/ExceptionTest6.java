package ex13.exception;

public class ExceptionTest6 {
    public static void main(String[] args){
        try{
            int i = 100 / 0;
            System.out.println("1");
        }catch (NumberFormatException e){
            System.out.println("2");
        }finally { //예외 발생 여부와 상관 없이 수행
            System.out.println(3);
            // 자원 해제
            //try{} ex) 파일을 오픈. finally에서 파일을 닫아주어야함.
            //try {} ex)  db 연결. finally에서 db 연결 반환.
        }
        System.out.println(4);
    }
}
