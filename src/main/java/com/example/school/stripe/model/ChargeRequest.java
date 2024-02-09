package com.example.school.stripe.model;

import com.stripe.param.SetupIntentConfirmParams;
import lombok.Data;

@Data
public class ChargeRequest {
    private String description;
    private int amount;
    private SetupIntentConfirmParams.PaymentMethodOptions.AcssDebit.Currency currency;
    private String stripeToken;
}
