package com.emlakburada.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Advert {

    public int id;
    public String advertDescription;
    public String advertTitle;
    String usageCase;
    BigDecimal price;
    private String[] photoList = new String[5];

    public Advert(){

    }

    @Override
    public String toString() {
        return "User [id=" + id + ", advertDescription=" + advertDescription + ", advertTitle=" + advertTitle + ", usageCase=" + usageCase
                + ", price=" + price + ", photoList=" + photoList + "]";
    }
}
