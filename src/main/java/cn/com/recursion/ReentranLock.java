package main.java.cn.com.recursion;

/**
 * 可重入锁：
 * 又名递归锁，是指在同一个线程在外层方法获取锁的时候，
 * 再进入该线程的内层方法会自动获取锁（前提锁对象得是同一个对象或者class），不会因为之前已经获取过还没释放而阻塞。
 * Java中ReentrantLock和synchronized都是可重入锁，可重入锁的一个优点是可一定程度避免死锁。
 *
 */
public class ReentranLock {


}
