package com.aspectOrientedProgramming;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

// BEfore and after annotations are called as point-cuts
    @Before(value = "execution(* *.*.*.checkout(..))") // *.*.checkout means any_package.any_class.function NOTE: *.*.*.func() is my case qki yaha package k name me hi ek extra . hai so make sure that for your  another upcoming code as well
    public void Logger(){
        System.out.println("CMD Logging on");
    }
    @After(value = "execution(* *.*.*.checkout(..))")
    public void AfterLogger(){
        System.out.println("CMD Logging on");
    }
}
