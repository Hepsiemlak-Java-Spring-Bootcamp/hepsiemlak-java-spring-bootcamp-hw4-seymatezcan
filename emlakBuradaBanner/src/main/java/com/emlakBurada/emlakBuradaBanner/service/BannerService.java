package com.emlakBurada.emlakBuradaBanner.service;


import com.emlakBurada.emlakBuradaBanner.dto.request.BannerRequest;
import com.emlakBurada.emlakBuradaBanner.dto.response.BannerResponse;
import com.emlakBurada.emlakBuradaBanner.model.Banner;
import com.emlakBurada.emlakBuradaBanner.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerService {

    @Autowired
    BannerRepository bannerRepository;

    public List<BannerResponse> getAllBanners(){
        List<BannerResponse>bannerResponses=new ArrayList<>();
        for(Banner banner:bannerRepository.findAll()){
            bannerResponses.add(convertToBannerResponse(banner));
        }
        return bannerResponses;
    }

    private BannerResponse convertToBannerResponse(Banner banner){
        BannerResponse response=new BannerResponse();
        response.setAdvertId(banner.getAdvertId());
        response.setPhoneNumber(banner.getPhoneNumber());
        response.setTotal(banner.getTotal());
        return response;
    }

    public BannerResponse saveBanner(BannerRequest bannerRequest){
        Banner banner=bannerRepository.save(convertToBanner(bannerRequest));
        return convertToBannerResponse(banner);
    }

    public BannerResponse updateBanner(BannerRequest bannerRequest){
        Banner banner=bannerRepository.save(convertToBanner(bannerRequest));
        return convertToBannerResponse(banner);
    }

    public void deleteBanner(int bannerId){
        bannerRepository.deleteById(bannerId);
    }

    public Banner convertToBanner(BannerRequest bannerRequest){
        Banner banner=new Banner();
        banner.setAdvertId(bannerRequest.getAdvertId());
        banner.setPhoneNumber(bannerRequest.getPhoneNumber());
        banner.setTotal(bannerRequest.getTotal());
        return banner;
    }


}
