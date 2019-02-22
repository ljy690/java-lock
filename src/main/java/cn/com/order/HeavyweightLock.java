package main.java.cn.com.order;

/**
 * 重量级锁：
 * 此时等待锁的线程都会进入阻塞状态。
 *
 * 偏向锁通过对比Mark Word解决加锁问题，避免执行CAS操作。
 * 而轻量级锁是通过用CAS操作和自旋来解决加锁问题，避免线程阻塞和唤醒而影响性能。重量级锁是将除了拥有锁的线程以外的线程都阻塞。
 */
public class HeavyweightLock {

}
