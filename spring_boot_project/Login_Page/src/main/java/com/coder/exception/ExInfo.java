package com.coder.exception;

import java.time.LocalDate;

public class ExInfo {

	private String exCode;
	private String excDesc;
	private LocalDate exDate;
	
	public ExInfo(String exCode, String excDesc, LocalDate exDate) {
		super();
		this.exCode = exCode;
		this.excDesc = excDesc;
		this.exDate = exDate;
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExcDesc() {
		return excDesc;
	}

	public void setExcDesc(String excDesc) {
		this.excDesc = excDesc;
	}

	public LocalDate getExDate() {
		return exDate;
	}

	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	
	
	
	
	
}
