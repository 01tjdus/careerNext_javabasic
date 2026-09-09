package ex19.threadEx;

class Count{
    int i = 0;
    void add(){
        i++;
    }
}
class Ex3 implements Runnable{
    Count c = new Count();
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i ++)
            c.add();
    }
}
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        Ex3 e = new Ex3();
        Thread ex1 = new Thread(e);
        Thread ex2 = new Thread(e);
        ex1.start();
        ex2.start();
        ex1.join();
        ex2.join();
        System.out.println(e.c.i);
    }
}
