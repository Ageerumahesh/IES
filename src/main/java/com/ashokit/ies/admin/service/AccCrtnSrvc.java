package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.domain.AccCrtn;

public interface AccCrtnSrvc {

	
	public Boolean valdtEmailId(String emailId);
	
	public Boolean saveAccCrtn(AccCrtn accCrtn);
	
	public List<AccCrtn> getAccCrtnList();
	
	public Boolean updateAccCrtn(Integer id,AccCrtn accCrtn);
	
	public Boolean deleteAccCrtn(Integer id);
	
	public Boolean activtAccCrtn(Integer id);
	
	
	
	
	
	
	
	
	
}
