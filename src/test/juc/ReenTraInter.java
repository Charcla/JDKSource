package test.juc;

import java.util.concurrent.locks.ReentrantLock;

public class ReenTraInter {

    private static ReentrantLock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread("t1"){
            @Override
            public void run() {
                say();
            }
        };
        Thread t2=new Thread("t1"){
            @Override
            public void run() {
                say();
            }
        };

        t1.start();
        Thread.sleep(3);
        t2.start();
        System.out.println(Thread.currentThread().getName());

        t2.interrupt();
    }

    private static void say(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000000000);
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
