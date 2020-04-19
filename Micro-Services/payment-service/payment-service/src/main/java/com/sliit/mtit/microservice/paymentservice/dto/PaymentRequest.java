package com.sliit.mtit.microservice.paymentservice.dto;

public class PaymentRequest {

    private String fullName;
    private String orderDetails;
    private String paymentType;
    private int qty;
    private double amount;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return "PaymentRequest{" +
                "fullName='" + fullName + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
