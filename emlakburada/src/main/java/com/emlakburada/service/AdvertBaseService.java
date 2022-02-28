package com.emlakburada.service;

import com.emlakburada.dto.request.AdvertRequest;
import com.emlakburada.dto.response.AdvertResponse;
import com.emlakburada.model.Advert;

public class AdvertBaseService {

    Advert convertToAdvertEntity(AdvertRequest advertRequest){
        Advert advert=new Advert();
        advert.setAdvertTitle(advertRequest.getAdvertTitle()) ;
        advert.setUsageCase(advertRequest.getUsageCase());
        advert.setEnrollee(advertRequest.getEnrollee());
        //advert.setEnrollee(advertRequest.getEnrollee());
        return advert;
    }

    AdvertResponse convertToAdvertResponse(Advert advert){
        AdvertResponse advertResponse=new AdvertResponse();
        advertResponse.setAdvertId(advert.getAdvertId());
        advertResponse.setAdvertTitle(advert.getAdvertTitle());
        advertResponse.setPrice(advert.getPrice());
        return advertResponse;
    }
}
