package com.emergon.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**@author emergon */
public class _Supplier {
//Supplier represents a supplier of results
    public static void main(String[] args) {
    
        System.out.println(getConnection());
        List<String> dbConnections = getConnectionsSupplier.get();
        System.out.println(dbConnections);
    }
    
    static String getConnection(){
        return "jdbc:mysql://localhost:5443/Test";
    }
    
    //Supplies a result of String
    static Supplier<List<String>> getConnectionsSupplier = () -> {
        List<String> list = new ArrayList();
        list.add("jdbc:mysql://localhost:5443/Test");
        list.add("jdbc:mysql://localhost:5443/Sample");
        return list;
    };
}
