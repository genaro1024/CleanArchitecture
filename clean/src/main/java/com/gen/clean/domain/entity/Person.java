package com.gen.clean.domain.entity;

import com.gen.clean.domain.valueobject.BirthdateVo;
import com.gen.clean.domain.valueobject.DniVo;
import com.gen.clean.domain.valueobject.IdVo;
import com.gen.clean.domain.valueobject.NamesVo;
import com.gen.clean.domain.valueobject.SurnamesVo;
import lombok.Data;

@Data
public class Person {
    private IdVo id;
    private DniVo dni;
    private NamesVo names;
    private SurnamesVo surnames;
    private BirthdateVo birthdate;
    private Author author;
}
