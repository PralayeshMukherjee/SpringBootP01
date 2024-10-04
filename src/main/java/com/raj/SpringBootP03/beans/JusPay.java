package com.raj.SpringBootP03.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class JusPay implements PaymentPartners{
    public JusPay(){
        System.out.println("JusPay Constructor Called.....");
    }
    @Override
    public void payment(String amount) {
        System.out.println(amount+" payment done by JusPay!");
    }
}
