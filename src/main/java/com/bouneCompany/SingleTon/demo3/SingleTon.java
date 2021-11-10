package com.bouneCompany.SingleTon.demo3;

/**

 */
public class SingleTon {

    private SingleTon(){}

    static volatile SingleTon obj;

    // 2 为了防止线程不安全的问题，加上了synchronized
//    public synchronized static SingleTon getObj() {
//        // 1 为了防止每次调用getObj的时候都是创建一个新的对象，那这样就不是单例了
//        if (obj == null){
//            obj = new SingleTon();
//        }
//        return obj;
//    }

    // 3 DCL （double check lock）
    public static SingleTon getObj(){
        if (obj == null) {
            synchronized (SingleTon.class) {
                if (obj == null) {
                    obj = new SingleTon();  // 写操作
                }
            }
        }
        return obj; // 读操作

        /**
         * 只有外部的if可以吗？
         *  不可以：因为这样仍然只是多个线程在排队而已，排完队之后，还是重新创建新的对象
         * 只有内部的if可以吗？
         *  可以，但是这和synchronized加在方法上面没有什么区别了，无法达到降低性能开销的好处。
         *
         * 为什么要两个if
         *  第一个if是为了判断是否需要去抢占锁，可能是有多个线程进入的。这个时候假设多个线程进入了
         *  那么，在争抢锁的时候会排队。第一个线程创建好对象之后，把锁给了第二个线程，第二个线程获得锁进去了
         *  第二个if，这个时候再一次判断，由于第一个线程已经创建了对象了，因此也不会创建对象，这个if为false。
         *
         *
         *  这种情况下已经很好了，但是在实际情况下会出现空指针问题。因为JVM底层会在实例化对象的时候进行优化和指令重排序
         *   解决：使用volatile关键字修饰成员变量，禁止重排序
         */
    }
}
