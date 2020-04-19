package com.sliit.mtit.microservice.orderservice.controller;


import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    OrderResponse createOrder(@RequestBody OrderRequest request) {

        System.out.println("Order Details: " + request);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setMessage("Successfully created the Order...!");
        return orderResponse;
    }
}
