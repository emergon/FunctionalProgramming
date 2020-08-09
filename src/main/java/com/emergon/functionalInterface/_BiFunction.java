package com.emergon.functionalInterface;

import java.util.function.BiFunction;

/**@author emergon */
public class _BiFunction {

    public static void main(String[] args) {
    
        //BiFunctions take 2 arguments and produce 1 result
        int add2NumbersResult = add2NumbersFunction.apply(10, 10);
        System.out.println("add2NumbersResult="+add2NumbersResult);
    }
    
    static BiFunction<Integer, Integer, Integer> add2NumbersFunction = (num1,num2) -> num1+num2;
    static int add2Numbers(int num1, int num2){
        return num1 + num2;
    }

}
