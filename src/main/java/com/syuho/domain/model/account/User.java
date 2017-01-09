package com.syuho.domain.model.account;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

import lombok.Getter;
import lombok.ToString;

@Entity(immutable = true, naming = NamingType.SNAKE_LOWER_CASE)
@Getter
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 357781232430448543L;

    public User(long userId, String userName, LocalDateTime createdDatetime, LocalDateTime updatedDatetime) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.createdDatetime = createdDatetime;
        this.updatedDatetime = updatedDatetime;
    }

    @Id
    private final long userId;
    private final String userName;
    private final LocalDateTime createdDatetime;
    private final LocalDateTime updatedDatetime;
}
