package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 13:20
 * \* Description:
 * \
 */
public class RunFile {
    public static void main(String[] args) {

        rf r1 = new rf();
        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r1).start();

    }
}

class rf implements Runnable {

    private int tickets = 5;

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            if (tickets > 0) {
                System.out.println("tickets " + tickets--);
            }
        }
    }
}