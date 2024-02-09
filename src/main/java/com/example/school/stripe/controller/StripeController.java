package com.example.school.stripe.controller;

import com.example.school.stripe.model.ChargeRequest;
import com.example.school.stripe.model.ChargeResponse;
import com.example.school.stripe.service.ChargeMapper;
import com.example.school.stripe.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/stripe")
public class StripeController {

    private final StripeService stripeService;
    private final ChargeMapper chargeMapper;

    @PostMapping(value = "/charge")
    public ChargeResponse charge(@RequestBody ChargeRequest chargeRequest)
            throws StripeException {
        Charge charge = stripeService.charge(chargeRequest);
        return chargeMapper.toChargeResponse(charge);
    }
}
