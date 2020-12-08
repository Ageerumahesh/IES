package com.ashokit.ies.admin.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="tblAccCrtn")
public class AccCrtnEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer sid;
	
	@Column(name = "ssnNo")
	private Long ssnNo;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "frstNm")
	private String frstNm;
	
	@Column(name = "lstNm")
	private String lstNm;
	
	@Column(name = "mailId")
	private String mailId;
	
	
	@Column(name = "pswd")
	private String pswd;
	
	
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "gndr")
    private String gndr;
	
	@Column(name = "phnNo")
    private Long phnNo;
	
	
	@Column(name = "role")
    private String role;
    
    
    
    
	

}
