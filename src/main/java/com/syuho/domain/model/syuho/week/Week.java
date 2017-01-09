package com.syuho.domain.model.syuho.week;

import java.util.stream.Stream;

import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, factoryMethod = "of")
public enum Week {
    //@formatter:off
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    ;
    
    private int value;
    
    private Week(int value) {
        this.value = value;
    }
        
    public static Week of(int value) {
        return Stream.of(Week.values())
                .filter(v -> v.value == value)
                .findFirst()
                .orElseThrow(() -> new RuntimeException(value + " is invalidate value."));
        //@formatter:on
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
