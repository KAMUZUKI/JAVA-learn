package com.mu.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

//    @Before("execution(* com.mu.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强...");
    }

//    @AfterReturning("execution(* com.mu.anno.*.*(..))")
    public void afterReturning(){
        System.out.println("后置增强...");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后...");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终增强...");
    }

    //定义切点表达式
    @Pointcut("execution(* com.mu.anno.*.*(..))")
    public void pointcut(){}
}
