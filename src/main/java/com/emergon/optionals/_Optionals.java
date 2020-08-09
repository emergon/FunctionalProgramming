package com.emergon.optionals;

import java.util.Optional;

/**@author emergon */
public class _Optionals {

    public static void main(String[] args) {
        Object defaultValue = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException("Value is null"));
        Optional.of(null)
                .ifPresent(text -> System.out.println(text));
        
    }

}
