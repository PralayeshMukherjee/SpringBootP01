package com.raj.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class RozerPay implements PaymentPartners{
    public RozerPay(){
        System.out.println("RozerPay Constructor Called.....");
    }
    @Override
    public void payment(String amount) {
        System.out.println(amount+" payment done by RozerPay!");
    }
}
