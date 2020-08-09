package com.emergon.combinatorPattern;

import com.emergon.combinatorPattern.CustomerRegistrationValidator.ValidationResult;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author emergon
 */
public class MainClass {

    public static void main(String[] args) {
        Customer customer = new Customer("Jack", LocalDate.of(2000, Month.MARCH, 12), "jack@email.com", "+302610234567");
        Customer customer2 = new Customer("Terry", LocalDate.of(2010, Month.MARCH, 12), "terry@email.com", "+202610234567");
        
        CustomerValidatorService validatorService = new CustomerValidatorService();
        boolean isCustomerValid = validatorService.isValid(customer2);
        System.out.println("is "+ customer2.getName() + " valid:"+isCustomerValid);
        
        //using customerRegistrationValidator
        ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer2);
        
        System.out.println("Is Customer Valid:"+result);
    }

}
