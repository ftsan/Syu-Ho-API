package com.syuho.domain.model.syuho;

import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, factoryMethod = "of")
public class Year {

    private final int value;
    
    private Year(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static Year of(int value) {
        return new Year(value);
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
