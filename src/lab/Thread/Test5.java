package lab.Thread;
//balance 필드를 가진 Account 클래스를 만들고,
//synchronized 메소드 deposit(int amount)로 잔액을 늘리세요.
//동일한 Account 객체에 대해 각각 1000원씩 100번 입금하는 스레드 2개를 실행하세요(총 입금 20만원 기대).
//join()으로 두 스레드가 끝나길 기다린 뒤 최종 잔액을 출력하세요.
//초기 잔액이 10000원일 때 최종 잔액이 정확히 210000원인지 확인하세요.

class Account  {
    int balance = 0;

    public Account(int balance) {
        this.balance = balance;
    }
    public synchronized void deposit(int amount) {
        balance += amount;//잔액에 amount 더하기
    }
}
class DepositTask implements Runnable {
    Account account;
    public DepositTask(Account account) {
        this.account = account;
    }
    public void run() {
        for(int i=0;i<100;i++) {
            account.deposit(1000);
        }
    }
}

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10000);

        Thread t1 = new Thread(new DepositTask(account));
        Thread t2 = new Thread(new DepositTask(account));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최종 잔액 : " + account.balance);
    }
}
