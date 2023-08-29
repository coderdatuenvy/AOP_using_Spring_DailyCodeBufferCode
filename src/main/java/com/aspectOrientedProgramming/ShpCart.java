package com.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component
public class ShpCart {
    public void checkout(){
        System.out.println("& We are checking out the cart");
    }
    public int quantity(){
        return 2;
    }
}
