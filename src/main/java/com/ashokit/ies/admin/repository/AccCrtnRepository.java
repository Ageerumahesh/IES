package com.ashokit.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.admin.entity.AccCrtnEntity;

public interface AccCrtnRepository extends JpaRepository< AccCrtnEntity, Serializable >{
	
	public AccCrtnEntity findByMailId(String email);
	public AccCrtnEntity findBySid(Integer sid);

}
