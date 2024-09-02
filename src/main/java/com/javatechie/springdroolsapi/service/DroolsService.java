package com.javatechie.springdroolsapi.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.springdroolsapi.model.Participant;
import com.javatechie.springdroolsapi.model.Rate;


@Service
public class DroolsService {

	@Autowired
	private KieContainer kieContainer;

	public Rate getRate(List<Participant> applicantRequest) {
		Rate rate = new Rate();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("rate", rate);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return rate;
	}

}
 