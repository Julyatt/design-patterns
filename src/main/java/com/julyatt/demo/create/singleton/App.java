package com.julyatt.demo.create.singleton;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

/**
 * Description
 *
 * @author guosh
 * @date 2019-06-27 17:17
 */
public class App {
    public static void main(String[] args) {
        Singleton1.getInstance();
        Singleton2.getInstance();
        Singleton2.getInstance2();

        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        BlockingQueue<Runnable> runnables = new ArrayBlockingQueue<Runnable>(16);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 0L,
                TimeUnit.MILLISECONDS, runnables, threadFactory);

        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.execute(() -> System.out.println(Singleton2.getInstance().hashCode()));
        }
        threadPoolExecutor.shutdown();

    }
}
