package com.emlakburada.service;

import com.emlakburada.dto.request.AdvertRequest;
import com.emlakburada.dto.response.AdvertResponse;
import com.emlakburada.model.Advert;
import com.emlakburada.repository.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdvertService extends AdvertBaseService{

    @Autowired
    AdvertRepository advertRepository;

    public List<AdvertResponse> getAllAdverts(){
        List<Advert>adverts=advertRepository.findAll();
        return adverts.stream().map(advert -> convertToAdvertResponse(advert)).collect(Collectors.toList());

    }

    public void saveAdvert(AdvertRequest advertRequest){
        advertRepository.save(convertToAdvertEntity(advertRequest));

    }

    public void updateAdvert(AdvertRequest advertRequest){
        advertRepository.save(convertToAdvertEntity(advertRequest));
    }

    public void deleteAdvert(int advertId){
        advertRepository.deleteById(advertId);
    }
}
