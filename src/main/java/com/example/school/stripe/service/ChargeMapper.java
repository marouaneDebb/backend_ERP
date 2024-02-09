package com.example.school.stripe.service;


import com.example.school.stripe.model.ChargeResponse;
import com.stripe.model.Charge;
import org.springframework.stereotype.Service;

@Service
public class ChargeMapper {

    public ChargeResponse toChargeResponse(Charge charge) {
        // Logic to map properties from Charge to ChargeResponse
        ChargeResponse chargeResponse = new ChargeResponse();
        // Set properties on chargeResponse based on charge
        return chargeResponse;
    }

    // Other mapping methods if needed
}
