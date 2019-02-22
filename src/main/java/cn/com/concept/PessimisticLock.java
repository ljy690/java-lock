package main.java.cn.com.concept;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 悲观锁：线程会锁住同步资源。
 * 悲观锁认为自己在使用数据时一定会有别的线程来修改数据，所以在获取数据时会添加锁，确保数据不会被别的线程修改。
 * Java中，synchronized关键字和Lock的实现类都是悲观锁。
 * 悲观锁适合写操作多的场景，先加锁可以保证写操作时数据正确。
 * @author jy
 */
public class PessimisticLock {
    public synchronized void testMethod(){
        //同步资源的一系列操作
    }

    //可重入锁，保证多个线程用的是一个锁，默认是非公平锁
    private ReentrantLock reentrantLock = new ReentrantLock();

    /**
     * 模拟修改公共资源
     */
    public void modifyPublicResource(){
        reentrantLock.lock();
        //操作公共资源
        reentrantLock.unlock();
    }
}
