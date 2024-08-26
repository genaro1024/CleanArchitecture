package com.gen.clean.domain.entity;

import java.util.List;

import com.gen.clean.domain.valueobject.CodeVo;
import com.gen.clean.domain.valueobject.IdVo;
import com.gen.clean.domain.valueobject.NameVo;
import lombok.Data;

@Data
public class Author {
    private IdVo id;
    private NameVo name; 
    private CodeVo code;
    private List<Book> books;
}
