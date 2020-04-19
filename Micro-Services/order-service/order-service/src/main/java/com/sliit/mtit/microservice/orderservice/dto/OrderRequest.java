package com.sliit.mtit.microservice.orderservice.dto;

public class OrderRequest {

    private String fullName;
    private String email;
    private String orderType;
    private  String orderDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
