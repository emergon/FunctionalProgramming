package com.emergon.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**@author emergon */
public class _Function {
    
    public static void main(String [] args){
        //Functions take 1 argument and produce 1 result
        int increment = incrementByOne(1);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
        
        Function<Integer, Integer> incrementBy1AndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        int result = incrementBy1AndMultiplyBy10.apply(1);
        System.out.println("result="+result);
        
        
    }
    
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static int incrementByOne(int number){
        return number+1;
    }
    
    
}
