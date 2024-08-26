package com.gen.clean.domain.entity;

import com.gen.clean.domain.valueobject.DescriptionVo;
import com.gen.clean.domain.valueobject.IdVo;
import com.gen.clean.domain.valueobject.IsbnVo;
import com.gen.clean.domain.valueobject.NameVo;

import lombok.Data;

@Data
public class Book {
    private IdVo id;
    private IsbnVo isbn;
    private NameVo name;
    private DescriptionVo description;
}
