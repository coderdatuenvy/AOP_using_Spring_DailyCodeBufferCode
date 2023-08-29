package com.aspectOrientedProgramming;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut(value = " within(com.aspectOrientedProgramming..*)")

    public void authenticatingPointCut(){

    }
    @Pointcut(value = " within(com.aspectOrientedProgramming..*)")
    public void authorizationPointCut(){

    }

    @Before(value = "authenticatingPointCut() && authorizationPointCut()")
    public void authorizted(JoinPoint jp){
        System.out.println("args :"+jp.getArgs());
        System.out.println("Authorizing the request : using AOP");
    }

    @Pointcut("execution(* *.*.*.quantity())")
    public void beforeReturnValuePointCut(){}
    @AfterReturning(pointcut = "beforeReturnValuePointCut()",returning = "arg")
    public void returnValuePointCut(String arg){
        System.out.println("the function was returning :" + arg);
    }

}
