package vip.ipav.shiro.simple.aspect;

import org.aspectj.lang.annotation.Aspect;

/**
 * Created by 89003522 on 2018/1/10.
 */
@Aspect
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
