package lab.Thread;
//int i 필드를 가진 Counter 클래스를 만들고, increment() 메소드로 i를 1씩 증가시키세요.
//increment()에 synchronized를 붙여 동기화하세요.
//같은 Counter 객체를 공유하는 두 스레드가 각각 100000번씩 increment()를 호출하게 하세요.
//join()으로 두 스레드가 모두 끝나길 기다린 뒤 최종 값을 출력하세요(기대값: 200000).

class Counter {
    int i = 0;
    void increment() {
        synchronized (this) {
            i++;
        }
    }
}
class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i <= 100000; i++) {
            counter.increment();
        }
    }
}
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 count: " + counter.i);
    }
}
