package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 17:33
 * \* Description:
 * \
 */
public class ThreadExec {

    public static void main(String[] args) {
        TE t1 = new TE("a",10000);
        TE t2 = new TE("b",20000);
        TE t3 = new TE("c",30000);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}

class TE implements Runnable {

    private String name;
    private int time ;

    public TE(String name,int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(name + " " + time);
    }

//    synchronized (同步对象) {
//        需要同步的代码
//    }
}