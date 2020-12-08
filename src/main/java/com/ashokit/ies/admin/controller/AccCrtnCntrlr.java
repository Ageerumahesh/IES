package com.ashokit.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.ies.admin.domain.AccCrtn;
import com.ashokit.ies.admin.service.AccCrtnSrvc;
import com.ashokit.ies.constants.AppConstants;
import com.ashokit.ies.props.AppProperties;

@RestController
@RequestMapping(value = AppConstants.INDEX_URI)
public class AccCrtnCntrlr {

	@Autowired
	private AccCrtnSrvc accCrtnSrvc;

	@Autowired
	private AppProperties props;

	@CrossOrigin(origins = "*")
	@GetMapping(value = AppConstants.IS_EMAIL_UNIQUE) 
	public ResponseEntity<String> isEmailIUnique(@PathVariable String isEmailIUnique) {
		Boolean isUnique = accCrtnSrvc.valdtEmailId(isEmailIUnique);
		return isUnique ?  ResponseEntity.ok((AppConstants.DUPLICATE_EMAIL))
				: ResponseEntity.ok((AppConstants.NOT_DUPLICATE_EMAIL));
	}

	@CrossOrigin(origins = "*")
	@PostMapping(value = AppConstants.CRET_ACC_CRTN)
	public ResponseEntity<String> handleSubmtBtn(@RequestBody AccCrtn accCrtn) {
		System.out.println(accCrtn);
		Boolean resAccCrtn = accCrtnSrvc.saveAccCrtn(accCrtn);
		return resAccCrtn ?  ResponseEntity.ok(props.getMessages().get("SAVE_MSG"))
				: ResponseEntity.ok(props.getMessages().get("SAVE_FAIL"));
	}

}
