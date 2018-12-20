package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 10:56
 * \* Description:
 * \
 */
public class ThreadExtend {

    public static void main (String[] args) {
        MyThread m1 = new MyThread("1");
        MyThread m2 = new MyThread("2");
        m1.run();
        m2.run();
    }
}


class MyThread extends Thread {

    private String name;
    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =0; i<10; i++)
        System.out.println(name);
    }
}