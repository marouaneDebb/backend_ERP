package com.example.school.stripe.model;

import lombok.Data;

@Data
public class ChargeResponse {
    public String status;
    public String id;
    public String transactionId;
}