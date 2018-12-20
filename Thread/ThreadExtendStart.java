package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 11:29
 * \* Description:
 * \
 */
public class ThreadExtendStart {

    public static void main(String[] args) {
        ThreadExtendS s1 = new ThreadExtendS("1");
        ThreadExtendS s2 = new ThreadExtendS("2");

        s1.start();
        s2.start();
    }
}


class ThreadExtendS extends Thread {

    private String name;

    public ThreadExtendS(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}