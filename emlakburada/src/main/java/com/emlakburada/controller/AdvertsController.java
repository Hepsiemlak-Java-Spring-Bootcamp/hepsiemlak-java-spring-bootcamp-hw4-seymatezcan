package com.emlakburada.controller;

import com.emlakburada.dto.request.AdvertRequest;
import com.emlakburada.dto.response.AdvertResponse;
import com.emlakburada.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvertsController {

    @Autowired
    AdvertService advertService;

    @GetMapping("/adverts")
    public ResponseEntity<List<AdvertResponse>>getAllAdverts(){
        return new ResponseEntity<>(advertService.getAllAdverts(), HttpStatus.OK);
    }

    @PostMapping("/adverts")
    public ResponseEntity<?>saveAdvert(@RequestBody AdvertRequest advertRequest){
        advertService.saveAdvert(advertRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/adverts")
    public ResponseEntity<?>updateAdvert(@RequestBody AdvertRequest advertRequest){
        advertService.updateAdvert(advertRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/adverts/{advertId}")
    public ResponseEntity<?>deleteAdvert(@PathVariable int advertId){
        advertService.deleteAdvert(advertId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
