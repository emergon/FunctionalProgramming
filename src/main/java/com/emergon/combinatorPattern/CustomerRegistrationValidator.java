package com.emergon.combinatorPattern;

import com.emergon.combinatorPattern.CustomerRegistrationValidator.*;
import static com.emergon.combinatorPattern.CustomerRegistrationValidator.ValidationResult.EMAIL_NOT_VALID;
import static com.emergon.combinatorPattern.CustomerRegistrationValidator.ValidationResult.IS_NOT_ADULT;
import static com.emergon.combinatorPattern.CustomerRegistrationValidator.ValidationResult.PHONE_NOT_VALID;
import static com.emergon.combinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**@author emergon */
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult>{
//https://medium.com/@hemant_joshi/combinator-design-pattern-4fe14c42f61d
    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }
    
    static CustomerRegistrationValidator isPhoneValid(){
        return customer -> customer.getPhone().startsWith("+30") ? SUCCESS : PHONE_NOT_VALID;
    }
    
    static CustomerRegistrationValidator isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : IS_NOT_ADULT;
    }
    
    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS)? other.apply(customer): result;
        };
    }
    
    enum ValidationResult{
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NOT_VALID,
        IS_NOT_ADULT
    }
}
