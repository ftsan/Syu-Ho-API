package com.syuho.api.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SyuhoDto implements Serializable {

    private static final long serialVersionUID = -3525122874000099030L;
    
    final private Week week;
    final private List<SyuhoItemDto> items;
}
