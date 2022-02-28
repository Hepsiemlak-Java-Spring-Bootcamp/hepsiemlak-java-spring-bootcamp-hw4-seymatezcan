package com.emlakburada.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Advert {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int advertId;
    @ManyToOne
    @JoinColumn(name="ENROLLEE_ID",nullable = false)
    private Enrollee enrollee;
    int favoriteCount;
    String usageCase;
    String advertTitle;
    String advertDescription;
    BigDecimal price;
    Boolean isForegrounding;
    Integer seenCount;
    Date publishedDate;
    Boolean isActive;
    Boolean isResearched;
    private String[] photoList = new String[5];

}
