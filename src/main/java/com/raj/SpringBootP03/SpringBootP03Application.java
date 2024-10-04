package com.raj.SpringBootP03;

import com.raj.SpringBootP03.beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringBootP03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootP03Application.class, args);
		Flipkart bean = context.getBean(Flipkart.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of your payment:- ");
		String amount = sc.nextLine();
		bean.PaymentGetway(amount);
	}
}
