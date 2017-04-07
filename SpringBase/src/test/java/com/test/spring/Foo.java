package com.test.spring;

public class Foo {
	
	private String iDCode;
	
	public void setIDCode(String iDCode){
		this.iDCode = iDCode;
	}

	@Override
	public String toString() {
		return "Foo [iDCode=" + iDCode + "]";
	}
	
	
	
}
