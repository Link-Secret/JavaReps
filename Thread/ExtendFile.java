package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 12:44
 * \* Description: 继承Thread类实现多线程，资源是否共享，卖五张票
 * \
 */
public class ExtendFile {

    public static void main(String[] args) {
        ef e1 = new ef();
        ef e2 = new ef();
        ef e3 = new ef();

        e1.start();
        e2.start();
        e3.start();
    }
}

class ef extends Thread {

    private int tickets = 5;


    @Override
    public void run() {
        for (int i = 0 ;i < 10 ;i++) {
            if (tickets > 0) {
                System.out.println("tickets" + tickets--);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
