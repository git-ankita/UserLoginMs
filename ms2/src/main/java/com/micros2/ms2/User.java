package com.micros2.ms2;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class User 
{
	
	private String uname;
	private String pswd;

	private String uemail;
	private String contactno;
	
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

		
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	@Override
	public String toString() {
		return "User [uname=" + uname + ", uemail=" + uemail + ", contactno=" + contactno + ", pswd=" + pswd + "]";
	}
	
	
	
	
	
}
