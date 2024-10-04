package com.raj.SpringBootP03.beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class Paytm implements PaymentPartners{
    public Paytm(){
        System.out.println("Paytm Constructor Called.....");
    }
    @Override
    public void payment(String amount) {
        System.out.println(amount+" payment done by Paytm!");
    }
}
