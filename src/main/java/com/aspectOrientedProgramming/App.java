package com.aspectOrientedProgramming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext appCon = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShpCart scart = appCon.getBean(ShpCart.class);
        scart.checkout();
    }
}
