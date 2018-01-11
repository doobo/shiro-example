package vip.ipav.shiro.simple.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by 89003522 on 2018/1/10.
 */
@Aspect
public class PreGreetingAdvisor {

    @Before("execution(* greetTo(..)) && !within(PreGreetingAdvisor)")
    public void beforeGreeting() {
        System.out.println("How are you!");
    }
}
