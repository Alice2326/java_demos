package com.hxying.java_demos.java_basis;
import java.lang.Runnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Integer i = 5;
        RunnableTask task = new RunnableTask();
        Thread thread1 = new Thread(task);
thread1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (i){
                    try {
                        i.wait();
                        thread1.join();
                        System.out.println(i);

                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }


                }

            }
        }).start();

        Thread.sleep(5000);
        synchronized (i){
            i.notify();
        }

        System.out.println("main end");

    }
}


class RunnableTask implements Runnable{
    int a = 0;
    @Override
    public void run() {

        try {
            Thread.sleep(10000);
            System.out.println(a);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }


    }
}



