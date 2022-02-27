package com.emlakburada.service;

import com.emlakburada.dto.request.EnrolleeRequest;
import com.emlakburada.dto.response.EnrolleeResponse;
import com.emlakburada.model.Enrollee;

public class EnrolleeBaseService {

    public Enrollee convertToEnrolleeEntity(EnrolleeRequest request){
        Enrollee enrollee=new Enrollee();
        enrollee.setName(request.getName());
        enrollee.setEmail(request.getEmail());
        enrollee.setEnrolleeDescription(request.getEnrolleeDescription());
        return enrollee;
    }

    protected EnrolleeResponse convertToEnrolleeResponse(Enrollee enrollee){
        EnrolleeResponse enrolleeResponse=new EnrolleeResponse();
        enrolleeResponse.setEmail(enrollee.getEmail());
        enrolleeResponse.setName(enrollee.getName());
        return enrolleeResponse;

    }
}
