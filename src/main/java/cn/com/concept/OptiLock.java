package main.java.cn.com.concept;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 乐观锁：线程不锁住同步资源。
 * 乐观锁认为自己在使用数据时不会有别的线程修改数据，所以不会添加锁。
 * 如果这个数据没有被更新，当前线程将自己修改的数据成功写入。
 * 如果数据已经被更新，则执行其他操作,报错或者自动重试。
 * 通过使用无锁编程来实现CAS：Compare And Swap（比较与交换）算法，Java原子类中的递增操作就是通过CAS自旋实现的。
 * 乐观锁适合读操作多的场景，不加锁的特点能够使其读操作的性能大幅提升。
 * @author jy
 */
public class OptiLock {
    public static void main(String[] args){
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }

}
