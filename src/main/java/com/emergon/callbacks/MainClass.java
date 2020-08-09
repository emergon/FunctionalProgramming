package com.emergon.callbacks;

import java.util.function.Consumer;

/**@author emergon */
public class MainClass {

    public static void main(String[] args) {
        hello("Tasos", null, value -> System.out.println("No last name provided for "+ value));
    }
    
    static void hello(String fname, String lname, Consumer<String> callback){
        System.out.println("first name:"+fname);
        if(lname != null){
            System.out.println("last name:"+lname);
        }else{
            System.out.print("last name:");
            callback.accept(fname);
        }
    }

}
