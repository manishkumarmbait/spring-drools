package com.javatechie.springdroolsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javatechie.springdroolsapi.model.Participant;
import com.javatechie.springdroolsapi.model.Rate;
import com.javatechie.springdroolsapi.service.DroolsRuleService;
import com.javatechie.springdroolsapi.service.DroolsService;

@RestController()
@RequestMapping("/bankservice")
public class DroolsSampleController {

	@Autowired
	private DroolsService bankService;

	@Autowired
	private DroolsRuleService droolsRuleService;

	@PostMapping("/getrate")
	public ResponseEntity<Rate> getRate(@RequestBody List<Participant> request) {
		Rate rate = bankService.getRate(request);
		return new ResponseEntity<>(rate, HttpStatus.OK);
	}

//	@PostMapping("/uploadDrlFile")
//	public ResponseEntity<String> uploadDrlFile(MultipartFile drlFile, @RequestBody Participant request) {
//		Rate rate = bankService.getRate(request);
//		return ResponseEntity.ok("DRL file uploaded successfully!");
//	}
//====================================================================================================

//	@PostMapping("/updateData")
//	public ResponseEntity<String> uploadDrlFile(MultipartFile drlFile, @RequestBody Participant request) {
//		Rate rate = bankService.getRate(request);
//		return ResponseEntity.ok("DRL file uploaded successfully!");
//	}
	
//====================================================================================================
	@RequestMapping(value = "/uploadCandidateProfile", method = RequestMethod.POST, produces = { "application/json",
			"multipart/form-data" }, consumes = { "application/json", "multipart/form-data" })
	public String uploadCandidateProfile(@RequestParam("files") MultipartFile[] file) {
//if (!authenticationService.authenticateAccessToken(accessToken)) {
//	BaseResponse response = new BaseResponse(CustomMessage.UNAUTHORIZED, false, HttpStatus.OK.value());
//	return new ResponseEntity<>(response, HttpStatus.OK);
//}
		if (file.length == 0) {
			return "File is empty";
		}
		String uploadCandidateProfile = droolsRuleService.uploadCandidateProfile(file);
		return uploadCandidateProfile;
	}

//=====================================================================================================	

}
