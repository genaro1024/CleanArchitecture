package com.gen.clean.domain.valueobject;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import lombok.Data;

@Data
public class BirthdateVo {
    private Date birthdate;
    private static final int LEGAL_AGE = 18;

    public void setBirthdate(Date birthdate){
        LocalDate birthdateLocal = birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdateLocal, currentDate);
        if(period.getYears() >= LEGAL_AGE){
            this.birthdate = birthdate;
        }
        else{
            throw new IllegalArgumentException("must be of legal age");
        }
    }
}
