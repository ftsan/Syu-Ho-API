package com.syuho.domain.model.syuho;

import java.io.Serializable;

import org.seasar.doma.Embeddable;

@Embeddable
public class Week implements Serializable {

    private static final long serialVersionUID = 3884216057303891834L;

    private final Year year;
    private final Month month;
    private final com.syuho.domain.model.syuho.week.Week week;
    
    public Week(Year year, Month month, com.syuho.domain.model.syuho.week.Week week) {
        this.year = year;
        this.month = month;
        this.week = week;
    }

    /**
     * フォーマット: yyyyMMW
     * 例: 2017年1月１周目
     * 2017011
     */
    @Override
    public String toString() {
        return year.toString() + month.toString() + week.toString();
    }
}
