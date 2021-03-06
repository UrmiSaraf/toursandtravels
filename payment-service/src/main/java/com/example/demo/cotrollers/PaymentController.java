package com.example.demo.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Payment;

@RestController
public class PaymentController {

	
	@Autowired
	private Payment payment;
	
	
	@GetMapping(path = "/payment")
	public Payment getPayment() {
		
		return payment;
	}
}
