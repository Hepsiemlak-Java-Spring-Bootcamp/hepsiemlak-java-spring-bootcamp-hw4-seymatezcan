package com.emlakburada.dto.response;

import com.emlakburada.model.Enrollee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Setter
public class AdvertResponse {

    int advertId;
    String advertTitle;
    Enrollee enrollee;
    String [] photoList=new String[5];
    BigDecimal price;
    Boolean isForegrounding;
    Boolean isResearched;
    Date publishedDate;
    Boolean isActive;
}
