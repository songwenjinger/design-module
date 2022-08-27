package com.mode.no1_singleton_demo;

/**
 * 单例模式
 *
 * 使用场景：需要共享数据 I/o ，数据库链接等 springIOC
 */
public class Demo01Singleton {


    //volatile为了防止指令重排序
    private static volatile Demo01Singleton instance;

    private Demo01Singleton() {
    }

    public static Demo01Singleton createSingleton() {
        if (instance == null) {
            synchronized (Demo01Singleton.class) {
                if (instance == null) {
                    instance = new Demo01Singleton();
                }
                return instance;
            }
        }
        return instance;
    }
}
