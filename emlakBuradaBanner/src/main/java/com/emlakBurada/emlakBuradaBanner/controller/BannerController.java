package com.emlakBurada.emlakBuradaBanner.controller;

import com.emlakBurada.emlakBuradaBanner.dto.request.BannerRequest;
import com.emlakBurada.emlakBuradaBanner.dto.response.BannerResponse;
import com.emlakBurada.emlakBuradaBanner.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping(value="/banners")
    public ResponseEntity<List<BannerResponse>>getAllBanners(){
        return new ResponseEntity<>(bannerService.getAllBanners(), HttpStatus.OK);
    }

    @PostMapping(value="/banners")
    public ResponseEntity<BannerResponse>saveBanner(@RequestBody BannerRequest bannerRequest){
        return new ResponseEntity<>(bannerService.saveBanner(bannerRequest),HttpStatus.OK);
    }

    @PostMapping(value="/banners/update")
    public ResponseEntity<BannerResponse> updateBanner(@RequestBody BannerRequest bannerRequest){
        return new ResponseEntity<>(bannerService.updateBanner(bannerRequest),HttpStatus.OK);
    }

    @DeleteMapping(value="/banners/{bannerId}")
    public ResponseEntity<?>deleteBanner(@PathVariable int bannerId){
        bannerService.deleteBanner(bannerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
