package main.java.cn.com.order;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 无锁 VS 偏向锁 VS 轻量级锁 VS 重量级锁，锁状态只能升级不能降级
 * 专门针对synchronized的
 * synchronized是悲观锁，在操作同步资源之前需要给同步资源先加锁，这把锁就是存在Java对象头里的
 * 无锁代表：CAS
 */
public class NoLock {
    public static void main(String[] args){
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
}
