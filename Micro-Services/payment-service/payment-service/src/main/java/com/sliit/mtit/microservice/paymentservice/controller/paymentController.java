package com.sliit.mtit.microservice.paymentservice.controller;


import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class paymentController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){

        System.out.println("Payment Details: " + paymentRequest);

        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(UUID.randomUUID().toString());
        paymentResponse.setMessage("Successfully created the Payment...!");
        return paymentResponse;
    }

}
