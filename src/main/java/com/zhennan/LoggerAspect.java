package com.zhennan;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//切面对象
//component等同于xml里配置bean
@Component
//使之成为切面对象
@Aspect
public class LoggerAspect {
    //业务方法之前,切割com.zhennan.Calculator里的所有public int修饰符的方法
    @AfterReturning(value = "execution(public int com.zhennan.Calculator.*(..))",returning = "hehe")
    public void afterReturning(JoinPoint joinPoint, Object hehe){
        System.out.println(hehe);
    }
}
