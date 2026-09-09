package ex19.threadEx;

class Ex2  implements Runnable
{	String name;
    Ex2(String name){ this.name = name; }
    public void run() {
        while(true){   //무한 루프. 이 메소드는 강제 종료해줘야 종료
    	try{
            Thread.yield(); // 다른쓰레드에게 양보
                            //yield로 양보 해도 우선 수누이가 높은 쓰레드가 더 많은
            //Thread.sleep(1000);  //1000ms=1초 sleep
            //System.out.println(name);
    }catch(Exception e){  e.printStackTrace();
        }
        }
    }
};  //Runnable 타입 객체는 new Thread()의 생성자의 매개인자로 사용.



public class ThreadTest2 {
    public static void main(String[] args)
    {	Thread ex1 = new Thread(new Ex2("aaa"));
        Thread ex2 = new Thread(new Ex2("bbb"));
        ex1.start();
/*ex1.start()호출은 run()을 호출. ex1은 Thread이므로 다른 메소드와 동시 실행)
(단, 자신의 run()이 없으므로 대신 매개인자로 받은 객체의 run() 호출)*/
        ex2.start();
/*ex2.start()호출은 run()을 호출. ex2은 Thread이므로 다른 메소드와 동시 실행)
(단, 자신의 run()이 없으므로 대신 매개인자로 받은 객체의 run() 호출)*/
    }

}
