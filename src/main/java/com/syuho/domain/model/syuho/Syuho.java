package com.syuho.domain.model.syuho;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

import lombok.Getter;
import lombok.ToString;

@Entity(immutable = true, naming = NamingType.SNAKE_LOWER_CASE)
@Getter
@ToString
public class Syuho implements Serializable {

    private static final long serialVersionUID = 3526164084423451934L;

    private final long syuhoId;
    private final long userId;
    private final String body;
    private final Week week;
    private final LocalDateTime createdDatetime;
    private final LocalDateTime updatedDatetime;

    public Syuho(long syuhoId, long userId, String body, Week week, LocalDateTime createdDatetime,
            LocalDateTime updatedDatetime) {
        super();
        this.syuhoId = syuhoId;
        this.userId = userId;
        this.body = body;
        this.week = week;
        this.createdDatetime = createdDatetime;
        this.updatedDatetime = updatedDatetime;
    }

}
