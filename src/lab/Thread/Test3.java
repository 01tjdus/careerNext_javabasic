package lab.Thread;

class SumThread extends Thread {
    long total = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            total += i;
        }
    }
}

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        SumThread s1 = new SumThread();
        s1.start();
        s1.join(); // join 없이도 해보기
        System.out.println("합계: " + s1.total);
    }
}
