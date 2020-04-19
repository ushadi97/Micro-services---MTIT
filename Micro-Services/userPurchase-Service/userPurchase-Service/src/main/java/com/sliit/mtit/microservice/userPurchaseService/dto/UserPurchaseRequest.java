package com.sliit.mtit.microservice.userPurchaseService.dto;

public class UserPurchaseRequest {

    private String fullName;
    private String email;
    private String telNo;
    private String orderType;
    private  String orderDetails;
    private String paymentType;
    private int qty;
    private double amount;

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

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "UserPurchaseRequest{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", telNo='" + telNo + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
