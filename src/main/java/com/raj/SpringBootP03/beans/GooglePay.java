package com.raj.SpringBootP03.beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class GooglePay implements PaymentPartners{
    public GooglePay(){
        System.out.println("GooglePay Constructor Called.....");
    }
    @Override
    public void payment(String amount) {
        System.out.println(amount+" payment done by GooglePay!");
    }
}
