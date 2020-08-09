package com.emergon.functionalInterface;

import java.util.function.BiConsumer;

/**
 * @author emergon
 */
public class _BiConsumer {

    public static void main(String[] args) {
        //BiConsumers Represent an operation that accepts two input arguments and returns no result.
        Customer customer = new Customer("Jack", "99999");
        printCustomer(customer, false);
        System.out.println("------BiConsumer------");
        printCustomerConsumer.accept(customer, true);

    }

    static BiConsumer<Customer, Boolean> printCustomerConsumer = (customer, showNumber) -> {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ").append(customer.name)
                .append(", phone:")
                .append(showNumber ? customer.phone : "*******");
        System.out.println(builder.toString());
    };

    static void printCustomer(Customer customer, boolean showNumber) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ").append(customer.name)
                .append(", phone:")
                .append(showNumber ? customer.phone : "*******");
        System.out.println(builder.toString());
    }

    static class Customer {

        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
