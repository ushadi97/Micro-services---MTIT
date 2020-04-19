package com.sliit.mtit.microservice.userPurchaseService.dto;

public class PaymentCreationResponse {

    private String paymentId;
    private String message;


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
