package Thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: acer zjl
 * \* Date: 2018/11/28 19:26
 * \* Description:生产者和消费者的问题
 * \
 */
class Info {
    //添加默认值，防止先运行消费者程序
    private String name = "a";
    private String content = "A";
    private boolean flag = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    将set，get方法同步是为了，一一对应，不能set一半，就可以取数据，必须set完成才可以取数据
    public synchronized void set(String name, String content) {
//        如果flag为TRUE，则生产者等待，消费者消费
        if(flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = true;
//      唤醒等待线程
        super.notify();
    }

    public synchronized void get() {
//      如果flag为FALSE，则消费者等待
        if(!flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + "-->" + this.getContent());
        flag = false;
        super.notify();
    }

}

class producer implements Runnable {
    private Info info = null;

    public producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for (int i=0; i<10; i++) {
            if(!flag) {
                this.info.set("a","A");
                flag = true;
            }else {
                this.info.set("b","B");
                flag = false;
            }
        }
    }
}

class consumer implements Runnable {

    private Info info = null;

    public consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.info.get();
        }
    }
}

public class ProducerAndConsumer {

    public static void main(String[] args) {
        Info i = new Info();
        producer p = new producer(i);
        consumer c = new consumer(i);

        new Thread(p).start();
        new Thread(c).start();

    }
}

//输出的一种结果

/*
a-->B
b-->A
b-->A
a-->B
a-->B
b-->A
a-->B
b-->A
b-->B
a-->A
*/

//加入同步后的一种结果
/*b-->B
b-->B
a-->A
b-->B
a-->A
b-->B
b-->B
a-->A
a-->A
a-->A*/


//加入等待和唤醒后
/*b-->B
a-->A
b-->B
a-->A
b-->B
a-->A
b-->B
a-->A
b-->B
a-->A*/