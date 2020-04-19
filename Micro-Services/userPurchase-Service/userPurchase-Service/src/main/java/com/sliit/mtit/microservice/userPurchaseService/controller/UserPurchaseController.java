package com.sliit.mtit.microservice.userPurchaseService.controller;

import com.sliit.mtit.microservice.userPurchaseService.dto.UserPurchaseRequest;
import com.sliit.mtit.microservice.userPurchaseService.dto.UserPurchaseResponse;
import com.sliit.mtit.microservice.userPurchaseService.service.UserPurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/userPurchase")
public class UserPurchaseController {

    @Autowired
    private UserPurchaseServiceImpl userPurchaseService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserPurchaseResponse createUserPurchase(@RequestBody UserPurchaseRequest userPurchaseRequest){

        System.out.println("User Details: " + userPurchaseRequest);


        return userPurchaseService.createUserPurchase(userPurchaseRequest);

    }
}
