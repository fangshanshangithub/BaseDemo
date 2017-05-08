package com.proxy.demo.statices;

public class StudentServiceImpl implements IStudentService {

	@Override
	public void lean() {
		 System.out.println(this.getClass().getName() + "---" + this.getClass().getName());

	}

}
