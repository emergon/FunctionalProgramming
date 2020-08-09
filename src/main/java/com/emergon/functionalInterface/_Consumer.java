package com.emergon.functionalInterface;

import java.util.function.Consumer;

/**@author emergon */
public class _Consumer {

    public static void main(String[] args) {
        //Consumers Represent an operation that accepts a single input argument and returns no result.
        Customer customer = new Customer("Jack", "99999");
        greetCustomer(customer);
        System.out.println("------Consumer------");
        greetCustomerConsumer.accept(customer);
        
    }
    
    static Consumer<Customer> greetCustomerConsumer = customer -> 
            System.out.println("Hello "+ customer.name);
    
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.name);
    }
    
    static class Customer{
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
