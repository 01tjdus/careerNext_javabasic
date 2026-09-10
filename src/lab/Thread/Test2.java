package lab.Thread;
//Runnable을 구현하는 PrintTask 클래스를 만드세요.
// 생성자로 메세지(message)와 반복횟수(count)를 받으세요.
//run()에서 message를 count번 출력하되, 매번 100ms(Thread.sleep) 쉬세요.
//main()에서 new Thread(Runnable)로 스레드 2개를 만들어 start()하세요.

class PrintTask implements Runnable {
    private String message;
    private int count;

    public PrintTask(String message, int count) {
        this.message = message;
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(100);
                System.out.println(message);
            }catch( Exception e){e.printStackTrace();
            }
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintTask("aaa",3));
        Thread t2 = new Thread(new PrintTask("bbb",3));
        t1.start();
        t2.start();
    }
}
