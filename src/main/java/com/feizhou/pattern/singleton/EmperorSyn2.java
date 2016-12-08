package com.feizhou.pattern.singleton;

/**
 * 双重校验锁
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class EmperorSyn2 {

    // volatile 可以保证多线程下的可见性
    // 读volatile：每当子线程某一语句要用到volatile变量时，都会从主线程重新拷贝一份，这样就保证子线程的会跟主线程的一致。
    // 写volatile: 每当子线程某一语句要写volatile变量时，都会在读完后同步到主线程去，这样就保证主线程的变量及时更新。
    private volatile static EmperorSyn2 emperorSyn2;

    private EmperorSyn2() {

    }

    public static EmperorSyn2 getInstance() {
        if (emperorSyn2 == null) {
            synchronized (EmperorSyn2.class) {
                if (emperorSyn2 == null) {
                    emperorSyn2 = new EmperorSyn2();
                    System.out.println(" 产生一个新实例 ********** ");
                }
            }
        }
        return emperorSyn2;
    }

}
