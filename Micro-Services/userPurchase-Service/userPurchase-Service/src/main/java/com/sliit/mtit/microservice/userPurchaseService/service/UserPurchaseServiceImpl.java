package com.sliit.mtit.microservice.userPurchaseService.service;


import com.sliit.mtit.microservice.userPurchaseService.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserPurchaseServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public UserPurchaseResponse createUserPurchase(UserPurchaseRequest userPurchaseRequest) {

        PaymentCreationRequest paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setFullName(userPurchaseRequest.getFullName());
        paymentCreationRequest.setOrderDetails(userPurchaseRequest.getOrderDetails());
        paymentCreationRequest.setPaymentType(userPurchaseRequest.getPaymentType());
        paymentCreationRequest.setQty(userPurchaseRequest.getQty());
        paymentCreationRequest.setAmount(userPurchaseRequest.getAmount());
        ResponseEntity<PaymentCreationResponse> paymentCreationResponse = restTemplate.postForEntity("http://localhost:8082/payments", paymentCreationRequest, PaymentCreationResponse.class);

        OrderCreationRequest orderCreationRequest = new OrderCreationRequest();
        orderCreationRequest.setFullName(userPurchaseRequest.getFullName());
        orderCreationRequest.setEmail(userPurchaseRequest.getEmail());
        orderCreationRequest.setOrderType(userPurchaseRequest.getOrderType());
        orderCreationRequest.setOrderDetails(userPurchaseRequest.getOrderDetails());
        ResponseEntity<OrderCreationResponse> orderCreationResponse = restTemplate.postForEntity("http://localhost:8081/orders", orderCreationRequest, OrderCreationResponse.class);

        UserPurchaseResponse userPurchaseResponse = new UserPurchaseResponse();
        userPurchaseResponse.setUserId(UUID.randomUUID().toString());
        userPurchaseResponse.setOrderId(orderCreationResponse.getBody().getOrderId());
        userPurchaseResponse.setPaymentId(paymentCreationResponse.getBody().getPaymentId());
        userPurchaseResponse.setMessage("Successfully purchased the order ...!");

        return userPurchaseResponse;
    }
        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder){
            return builder.build();
        }
    }

