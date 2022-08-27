使用场景：需要共享数据 I/o ，数据库链接等 springIOC
1. 代码关键点：双重锁+volatile修饰变量+static方法+私有构造
2. 