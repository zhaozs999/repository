package com.zhaozs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/5/9
 * @ 描述
 */
public class TestProduct {
    public static void main(String[] args) {

        final Product_1 pro = new Product_1();

        Runnable rn1 = new Runnable() {
            @Override
            public void run() {
                for (char c = 'A'; c <= 'Z'; c++) {
                    try {
                        pro.push(c);
                        System.out.println("--------------------rn1入栈--------------------");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("入栈rn1结束===============================================");
            }
        };

        Runnable rn2 = new Runnable() {
            @Override
            public void run() {
                for (char c = 'A'; c <= 'Z'; c++) {
                    try {
                        pro.push(c);
                        System.out.println("--------------------rn2入栈--------------------");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("入栈rn2结束===============================================");
            }
        };

        Runnable rn3 = new Runnable() {
            @Override
            public void run() {
                for (int c = 0; c < 26; c++) {
                    try {
                        pro.pop();
                        System.out.println("==========出栈rn3=========" + c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("出栈rn3结束===============================================");
            }
        };
        Runnable rn4 = new Runnable() {
            @Override
            public void run() {
                for (int c = 0; c < 26; c++) {
                    try {
                        pro.pop();
                        System.out.println("==========出栈rn4=========" + c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("出栈rn4结束===============================================");
            }
        };

        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(rn1);
        ex.submit(rn3);
        ex.submit(rn2);
        ex.submit(rn4);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pro.test();

        // 生产者
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                        System.out.println("================生产者==============  1 ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                        System.out.println("================生产者==============  2  ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        // 消费者
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 26; i++) {
                        try {
                            pro.pop();
                            System.out.println("================消费者==============  3  ");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 26; i++) {
                        try {
                            pro.pop();
                            System.out.println("================消费者==============  4  ");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();


        System.out.println("**************************************************************************************************");
    }
}

class Product_1 {

    private Object[] obj = new Object[5];
    private int index;

    // 入栈
    public synchronized void push(Object o) throws InterruptedException {
        while (index == obj.length) {
            this.wait();
        }
        obj[index] = o;
        index++;
        this.notifyAll();
        System.out.println("下标为：" + index + "入栈对象---------->" + o);

    }

    // 出栈
    public synchronized void pop() throws InterruptedException {
        while (index == 0) {
            this.wait();
        }
        index--;
        this.notifyAll();
        System.out.println("出栈对象===========================》" + obj[index]);

    }

    public void test() {
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i] + "             " + i);
        }
    }
}
