package com.emlakburada.controller;

import com.emlakburada.dto.request.EnrolleeRequest;
import com.emlakburada.dto.response.EnrolleeResponse;
import com.emlakburada.model.Enrollee;
import com.emlakburada.service.EnrolleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnrolleesController {

    @Autowired
    EnrolleeService enrolleeService;

    @GetMapping("/enrollees")
    ResponseEntity<List<Enrollee>> getAllEnrollees(){
        return new ResponseEntity<>(enrolleeService.getAllEnrollees(), HttpStatus.OK);
    }

    @PostMapping("/enrollees")
    ResponseEntity<EnrolleeResponse> saveEnrollee(@RequestBody EnrolleeRequest enrolleeRequest){
        enrolleeService.saveEnrollee(enrolleeRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/enrollees")
    ResponseEntity<EnrolleeResponse> updateEnrollee(@RequestBody EnrolleeRequest enrolleeRequest){
        enrolleeService.updateEnrollee(enrolleeRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/enrollees")
    ResponseEntity<ResponseEntity>deleteEnrollee(@PathVariable int enrolleeId){
        enrolleeService.deleteEnrollee(enrolleeId);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
