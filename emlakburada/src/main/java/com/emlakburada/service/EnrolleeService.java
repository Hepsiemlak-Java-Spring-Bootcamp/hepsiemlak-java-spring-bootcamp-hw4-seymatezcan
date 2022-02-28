package com.emlakburada.service;

import com.emlakburada.dto.request.EnrolleeRequest;
import com.emlakburada.model.Enrollee;
import com.emlakburada.repository.EnrolleeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolleeService extends EnrolleeBaseService{

    @Autowired
    EnrolleeRepository enrolleeRepository;

    public List<Enrollee> getAllEnrollees(){
        List<Enrollee>enrollees=enrolleeRepository.findAll();
        return enrollees;
    }

    public void saveEnrollee(EnrolleeRequest enrolleeRequest){
        enrolleeRepository.save(convertToEnrolleeEntity(enrolleeRequest));
    }

    public void updateEnrollee(EnrolleeRequest enrolleeRequest){
        enrolleeRepository.save(convertToEnrolleeEntity(enrolleeRequest));
    }

    public void deleteEnrollee(int enrolleeId){
        enrolleeRepository.deleteById(enrolleeId);
    }
}
