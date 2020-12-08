package com.ashokit.ies.admin.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AccCrtn {
	
	private Integer sid;
	private Long ssnNo;
	private String status;
	private String frstNm;
	private String lstNm;
	private String mailId;
	private String pswd;
	private LocalDate dob;
    private String gndr;
    private Long phnNo;
    private String role;
    

}
