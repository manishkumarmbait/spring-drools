package com.javatechie.springdroolsapi.service;

import java.io.IOException;

import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DroolsRuleService {

	 @Autowired
	    private KieContainer kieContainer;

//	    public void updateRules(MultipartFile drlFile) {
//	        try {
//	            // Get the content of the uploaded DRL file
//	            String drlContent = new String(drlFile.getBytes());
//
//	            System.out.println("drlContent : " + drlContent);
//	            // Update rules dynamically
//	            // You may need to implement the logic to dynamically update the KieContainer
//	            // This could involve creating a new KieFileSystem, adding resources, and rebuilding the KieContainer
//	            // Consult Drools documentation for dynamic rule updates: https://docs.jboss.org/drools/release/7.62.0.Final/drools-docs/html_single/index.html#_updating_rules_dynamically
//	        } catch (IOException e) {
//	            // Handle file reading error
//	            e.printStackTrace();
//	            // You might want to throw an exception or return an error response
//	        }
//	    }
	 
//======================================================================================
	 
		public String uploadCandidateProfile(MultipartFile[] m) {
//			Candidate candidate = candidateRepository.findByCandidateId(candidateId);
//			if (candidate != null) {
//				if (candidate.getProfileImage() != null) {
//					uploadFile.deleteImage(candidate.getProfileImage(), candidate.getProfileImageLocation());
//				}
				if (m != null) {
					for (MultipartFile multipartFile : m) {
						if (multipartFile.isEmpty()) {
							continue;
						}
//						HashMap<String, String> hashMap = uploadFile.saveImage(multipartFile, "CandidateProfileImage",
//								candidate.getCandidateId());
//						candidate.setProfileImage(hashMap.get(DataConstants.fileName));
//						candidate.setProfileImageLocation(hashMap.get(DataConstants.location));
					}
				}
//				candidate.setUpdatedDate(new Date());
//				candidateRepository.save(candidate);
//				return new BaseResponse(CustomMessage.SAVE_SUCCESS_MESSAGE, true, HttpStatus.CREATED.value());
//			} else {
////				return new BaseResponse("No record found for given id: " + candidateId, false, HttpStatus.OK.value());
//			}
				return "Testing Done";
		}
	 
	 
//======================================================================================	 
}
