package ex19.threadEx;

import java.io.*;
import java.util.*;

public class JoinTest implements Runnable {
    Scanner br = new Scanner(System.in);
    static  String name = null;
    public void run() {
        System.out.println("이름을 입력하세요");
        name = br.nextLine();
        System.out.println("입력받은 이름 출력 : "+name);
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinTest());
        t1.start();
        t1.join(); //다른 스레드를 받을때 join
        System.out.println(name);
    }
}
