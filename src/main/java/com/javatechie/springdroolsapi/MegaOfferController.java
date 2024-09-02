//package com.javatechie.springdroolsapi;
//
//import org.kie.api.runtime.KieSession;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MegaOfferController {
//
//	private KieSession session;
//
//	@PostMapping("/order")
//	public Order orderNow(@RequestBody Order order) {
//		
//		session.insert(order);
//		session.fireAllRules();
//
//		return order;
//	}
//}
