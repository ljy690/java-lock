package main.java.cn.com.order;

/**
 * 轻量级锁：
 * 当锁是偏向锁的时候，被另外的线程所访问，偏向锁就会升级为轻量级锁，其他线程会通过自旋的形式尝试获取锁，不会阻塞，从而提高性能。
 * 若当前只有一个等待线程，则该线程通过自旋进行等待。
 * 但是当自旋超过一定的次数，或者一个线程在持有锁，一个在自旋，又有第三个来访时，轻量级锁升级为重量级锁
 */
public class LightweightLocking {


}
