package com.emergon.functionalInterface;

import java.util.function.Predicate;

/**@author emergon */
public class _Predicate {

    //Predicate Represents a predicate (boolean-valued function) of one argument.
    public static void main(String[] args) {
        System.out.println(isNameLarge("Anastasios"));
        boolean isNameLarge = isNameLargePredicate.test("Anastasios");
        System.out.println("isNameLarge:"+isNameLarge);
        
        boolean largeNameWithA = isNameLargePredicate.and(nameStartsWithA).test("Andy");
        System.out.println("largeNameWithA="+largeNameWithA);
    }
    
    static boolean isNameLarge(String name){
        return name.length() > 5;
    }
    static Predicate<String> isNameLargePredicate = name -> name.length() > 5;
    static Predicate<String> nameStartsWithA = name -> name.startsWith("A");

}
