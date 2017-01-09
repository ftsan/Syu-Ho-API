package com.syuho.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Week {
    private final int year;
    private final int month;
    private final int week;
    
    public static Week parse(com.syuho.domain.model.syuho.Week week) {
        return new Week(week.getYear().getValue(), week.getMonth().getValue(), week.getWeek().getValue());
    }
}
