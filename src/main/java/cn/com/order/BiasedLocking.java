package main.java.cn.com.order;

/**
 * 偏向锁：
 * 一段同步代码一直被一个线程所访问，那么该线程会自动获取锁，降低获取锁的代价
 * 偏向锁在JDK 6及以后的JVM里是默认启用的。可以通过JVM参数关闭偏向锁：-XX:-UseBiasedLocking=false，关闭之后程序默认会进入轻量级锁状态。
 */
public class BiasedLocking {


}
