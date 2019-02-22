package main.java.cn.com.spin;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自旋锁：阻塞或唤醒一个Java线程需要操作系统切换CPU状态来完成，
 * 这种状态转换需要耗费处理器时间。如果同步代码块中的内容过于简单，状态转换消耗的时间有可能比用户代码执行的时间还要长。
 * 在许多场景中，同步资源的锁定时间很短，为了这一小段时间去切换线程，线程挂起和恢复现场的花费可能会让系统得不偿失。
 * 如果物理机器有多个处理器，能够让两个或以上的线程同时并行执行，我们就可以让后面那个请求锁的线程不放弃CPU的执行时间，看看持有锁的线程是否很快就会释放锁。
 * 而为了让当前线程“稍等一下”，我们需让当前线程进行自旋，如果在自旋完成后前面锁定同步资源的线程已经释放了锁，
 * 那么当前线程就可以不必阻塞而是直接获取同步资源，从而避免切换线程的开销。
 *
 * 自旋锁自旋会比较占用CPU，如果锁被占用时间过长会浪费处理器资源，自旋锁默认10次。可以使用-XX：PreBlockSpin来更改
 * 例子：CAS
 */
public class SpinLock {

    public static void main(String[] args){
        AtomicInteger atomicInteger = new AtomicInteger();
        //里面的do...while就是自旋
        atomicInteger.incrementAndGet();
    }
}
