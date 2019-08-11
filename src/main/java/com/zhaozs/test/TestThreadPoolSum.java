package com.zhaozs.test;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/5/10
 * @ 描述
 */
public class TestThreadPoolSum {

    @Test
    public void test() {
        TestSum ts = new TestSum();
        System.out.println(ts.intA());
        System.out.println(ts.intB());

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final TestSum ts = new TestSum();

        Callable task1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        ts.a += i;
                    }
                }
                return ts.a;
            }
        };

        Callable task2 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        ts.b += i;
                    }
                }
                return ts.b;
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> sb1 = es.submit(task1);
        Future<Integer> sb2 = es.submit(task2);
        Integer result1 = sb1.get();
        Integer result2 = sb2.get();
        System.out.println("sb1----->" + result1 + ",    sb2-----> " + result2);
    }


}

class TestSum {

    int a = 0;
    int b = 0;
    public Integer intA() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                a += i;
            }
        }
        return a;
    }

    public Integer intB() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                b += i;
            }
        }
        return b;
    }
}
