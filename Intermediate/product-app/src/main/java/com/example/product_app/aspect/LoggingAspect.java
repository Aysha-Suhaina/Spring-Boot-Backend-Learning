package com.example.product_app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    
   @Before("execution(* com.example.product_app.service.*.*(..))")
public void logBefore(JoinPoint joinPoint) {
    System.out.println("Before method called: " + joinPoint.getSignature().getName());
}

@AfterReturning(pointcut = "execution(* com.example.product_app.service.*.*(..))", returning = "result")
public void logAfter(JoinPoint joinPoint, Object result) {
    System.out.println("After method completed: " + joinPoint.getSignature().getName());
}

@AfterThrowing(pointcut = "execution(* com.example.product_app.service.*.*(..))", throwing = "ex")
public void logException(JoinPoint joinPoint, Exception ex) {
    System.out.println("Exception in method: " + joinPoint.getSignature().getName() + ", Error: " + ex.getMessage());
}

    
}
