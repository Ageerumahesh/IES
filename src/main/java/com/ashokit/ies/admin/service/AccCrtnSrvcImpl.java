package com.ashokit.ies.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.domain.AccCrtn;
import com.ashokit.ies.admin.entity.AccCrtnEntity;
import com.ashokit.ies.admin.repository.AccCrtnRepository;


@Service
public class AccCrtnSrvcImpl implements AccCrtnSrvc {

	@Autowired
	private AccCrtnRepository repo;

	@Override
	public Boolean valdtEmailId(String emailId) {
		AccCrtnEntity resEntity = repo.findByMailId(emailId);
		return resEntity.getSid() != null;
	}

	@Override
	public Boolean saveAccCrtn(AccCrtn accCrtn) {
		AccCrtnEntity entity = null;
		entity = new AccCrtnEntity();
		BeanUtils.copyProperties(accCrtn, entity);
		entity.setStatus("active");
		AccCrtnEntity resEntity = repo.save(entity);
		return resEntity.getSid() != null;
	}

	@Override
	public List<AccCrtn> getAccCrtnList() {
		ArrayList<AccCrtn> listOfAccCrtnModels = new ArrayList<>();
		List<AccCrtnEntity> listOfAccCrtn = repo.findAll();
		listOfAccCrtn.forEach(accCrtnEnity -> {
			AccCrtn accCrtn = new AccCrtn();
			BeanUtils.copyProperties(accCrtnEnity, accCrtn);
			listOfAccCrtnModels.add(accCrtn);
		});
		return listOfAccCrtnModels;
	}

	@Override
	public Boolean updateAccCrtn(Integer id, AccCrtn accCrtn) {
		
       
		return null;
	}
                                                                                                                                                               
	@Override
	public Boolean deleteAccCrtn(Integer id) {
		AccCrtnEntity accCrtnEnitty = repo.findBySid(id);
		accCrtnEnitty.setStatus("deActivate");
		repo.save(accCrtnEnitty);
		return true;
	}

	@Override
	public Boolean activtAccCrtn(Integer id) {

		return null;
	}

}
