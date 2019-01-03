生产者消费者模式（producer consumer Pattern）
具体模式讲述参考网址：
https://blog.csdn.net/u011109589/article/details/80519863
https://www.cnblogs.com/chentingk/p/6497107.html
https://www.cnblogs.com/fankongkong/p/7339848.html

此处使用三种实现方式实现生产者、消费之模式

第一种方式通过 synchronized wait和notify 实现
如果一个代码块被synchronized修饰了，当一个线程获取了对应的锁，并执行该代码块时，其他线程便只能一直等待，等待获取锁的线程释放锁.
synchronized不需要用户去手动释放锁，当synchronized方法或者synchronized代码块执行完之后，系统会自动让线程释放对锁的占用；
第二种方式通过 lock和condition的await、signalAll 实现
Lock和synchronized的区别和使用
https://www.cnblogs.com/baizhanshi/p/6419268.html