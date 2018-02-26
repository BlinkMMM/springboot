package com.demo.springboot.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpeakWhenAspect {
    @Pointcut("execution(* com.demo.springboot.service.BookPoint.speaking(..))")
    public void speaking(){}

    @Before("speaking()")
    public void sayHi(){
        System.out.println("========切点开始=========");
    }

    @After("speaking()")
    public void sayBye(){
        System.out.println("========切点结束==========");
    }

    @Around("speaking()")
    public void sayAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------环绕前-------");
        pjp.proceed();
        System.out.println("--------环绕后-------");
    }
}
