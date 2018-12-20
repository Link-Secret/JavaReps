package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 18:49
 * \* Description:
 * \
 */


class zhangsan {
    public void say() {
        System.out.println("你给我画，我就给你书");
    }
    public void get() {
        System.out.println("zs得到画");
    }
}

class lisi {
    public void say() {
        System.out.println("你给我书，我就给你画");
    }
    public void get() {
        System.out.println("ls得到书");
    }
}

public class DeadLock implements Runnable {
    private static zhangsan zs = new zhangsan();
    private static lisi ls = new lisi();
    private boolean flag = false;


    @Override
    public void run() {
        if(flag) {
            synchronized (zs) {
                zs.say();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ls) {
                    zs.get();
                }
            }
        }else {
            synchronized (ls) {
                ls.say();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs) {
                    ls.get();
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock t1 = new DeadLock();
        DeadLock t2 = new DeadLock();

        t1.flag = true;  //当前线程进入zs
        t2.flag = false; //当前线程进入ls

        new Thread(t1).start();
        new Thread(t2).start();


    }
}