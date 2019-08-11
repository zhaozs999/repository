package com.zhaozs.test;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.zhaozs.dao.UserDao;
import com.zhaozs.entity.User;
import com.zhaozs.utils.Utils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.relation.RoleUnresolved;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/25
 * @ 描述
 */
public class UserTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void regist() {
        User u = new User();

        u.setUserName("赵志盛");
        u.setPassword("999555");
        u.setAge(33);

        u.setStatus("Y");
        userDao.registerUser(u);
    }

    @Test
    public void login() {
        userDao.login("赵志盛", "999555", 1);
    }

    @Test
    public void test() {
        BigDecimal id = Utils.getId();
        Date date = new Date();
        System.out.println("--------->" + id);
        System.out.println("--------->" + date);

    }

    public long now() {
        return System.currentTimeMillis();
    }

    @Test
    public void test_1() {
        String str = "123456789012345678901234567890";
        char[] c = new char[18];
        Random rd = new Random();
        for (int i = 0; i < c.length; i++) {
            int j = rd.nextInt(str.length());
            c[i] = str.charAt(j);
        }
        String s = String.valueOf(c);
        Long id = Long.valueOf(s);
        BigDecimal bigDecimal = BigDecimal.valueOf(id);
        System.out.println(bigDecimal);
    }

    public static String saltCode() {
        //创建字典
        //String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String str = "123456789012345678901234567890";
        //获得随机码
        Random rd = new Random();
        //创建数组
        char[] chs = new char[18];
        //填充数组
        for (int i = 0; i < chs.length; i++) {
            int nextInt = rd.nextInt(str.length());
            chs[i] = str.charAt(nextInt);
        }
        String valueOf = String.valueOf(chs);
        return valueOf;
    }

    @Test
    public void teested() {
        System.out.println(Utils.getRandomId());

    }

    @Test
    public void testExecutor() {
        final Product pro = new Product();
        Runnable rn1 = new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn2 = new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 26; i++) {
                    try {
                        pro.pop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn4 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 26; i++) {
                    try {
                        pro.pop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(rn1);
        es.submit(rn2);
        es.submit(rn3);
        es.submit(rn4);

    }

    public static void main(String[] args) {
        final Product pro = new Product();
        // 生产者
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("================生产者==============  1 ");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("================生产者==============  2  ");
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
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("================消费者==============  3  ");
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 26; i++) {
                        try {
                            pro.pop();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("================消费者==============  4  ");
            }
        });

        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();



        Runnable rn1 = new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn2 = new Runnable() {
            @Override
            public void run() {
                for (char i = 'A'; i <= 'Z'; i++) {
                    try {
                        pro.push(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 26; i++) {
                    try {
                        pro.pop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable rn4 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 26; i++) {
                    try {
                        pro.pop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(rn1);
        es.submit(rn2);
        es.submit(rn3);
        es.submit(rn4);
    }

}

class Product {
    private Object[] str = new Object[5];
    private int index;

    // 存储
    public synchronized void push(Object o) throws InterruptedException {
        while (index == str.length) {
            this.wait();
        }
        str[index] = o;
        System.out.println("存储下标:" + index + "---------->" + o);
        index++;
        this.notifyAll();
    }

    // 取出
    public synchronized void pop() throws InterruptedException {
        while (index == 0) {
            this.wait();
        }

        index--;

        System.out.println("取出下标:" + index + "---------->" + str[index]);
        this.notifyAll();

    }

}