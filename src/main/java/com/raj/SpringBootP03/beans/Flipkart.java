package com.raj.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Flipkart {
    @Autowired
    @Qualifier("jusPay")
    PaymentPartners patners;

    @Value("${jdbc.url}")
    private String url;
    public Flipkart(){
        System.out.println("flipkart constructor.....");
    }
    public void PaymentGetway(String amount){
        System.out.println(url);
        patners.payment(amount);
    }
}
