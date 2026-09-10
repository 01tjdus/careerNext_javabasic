package lab.Thread;
//Thread를 상속받는 CountThread 클래스를 만드세요.
//생성자로 이름(name)과 반복횟수(count)를 받으세요.
//생성자에서 super(name)을 호출해 스레드 이름을 지정하세요.
//run()에서 1부터 count까지 "이름 : 숫자"를 출력하세요.
//main()에서 서로 다른 이름의 CountThread 2개를 만들어 start()로 실행하세요.

class CountThread extends Thread {
    private int count;

    public CountThread(String name, int count) {
        super(name);
        this.count = count;
    }
    public void run() {
        for (int i = 0; i <= count; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        CountThread ct1 = new CountThread("A", 3);
        CountThread ct2 = new CountThread("B", 3);
        ct1.start();
        ct2.start();
    }
}
