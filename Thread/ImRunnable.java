package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 12:19
 * \* Description:
 * \
 */
public class ImRunnable {


    public static void main(String[] args) {

        imRun i1 = new imRun("a");
        imRun i2 = new imRun("b");

//      Thread 类提供 public（Runnable target) 的构造方法，可以接收Runnable的子类实例对象
        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);
        t1.start();
        t2.start();

    }
}

class imRun implements Runnable {

    private String name;

    public imRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}