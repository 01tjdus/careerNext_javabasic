package ex19.threadEx;

class Ex extends Thread{
    @Override
    public void run() {
        int cnt = 0;
        while (cnt++ < 10){ // 자연스럽게 종료 되도록 수정
        //while (true) {//무한루프. 강제종료 해야함.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        Ex ex1 = new Ex(); ex1.setPriority(10);//우선순위 부여
        Ex ex2 = new Ex(); ex2.setPriority(1);
        ex1.start();
        ex2.start();
    }
}
