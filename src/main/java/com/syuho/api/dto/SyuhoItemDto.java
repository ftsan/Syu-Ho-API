package com.syuho.api.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SyuhoItemDto implements Serializable {

    private static final long serialVersionUID = -7293331649738181338L;

    private final long syuhoId;
    private final String body;
    private final User user;
}
