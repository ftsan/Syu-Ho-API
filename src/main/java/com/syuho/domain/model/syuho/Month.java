package com.syuho.domain.model.syuho;

import java.util.stream.Stream;

import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, factoryMethod = "of")
public enum Month {
    // @formatter:off
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12),
    ;

    private int value;

    private Month(int value) {
        this.value = value;
    }

    public static Month of(int value) {
        // @formatter:off
        return Stream.of(Month.values())
                .filter(v -> v.value == value)
                .findFirst()
                .orElseThrow(() -> new RuntimeException(value + " invalidate value."));
       // @formatter:on
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%02d", value);
    }
}
