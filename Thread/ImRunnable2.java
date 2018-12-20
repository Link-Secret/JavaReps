package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 12:19
 * \* Description:
 * \
 */
public class ImRunnable2 implements Runnable {

    private String name;

    public ImRunnable2(String name) {
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

    public static void main(String[] args) {

        ImRunnable2 i1 = new ImRunnable2("a");
        ImRunnable2 i2 = new ImRunnable2("b");

//      Thread 类提供 public（Runnable target) 的构造方法，可以接收Runnable的子类实例对象
        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();

    }

}