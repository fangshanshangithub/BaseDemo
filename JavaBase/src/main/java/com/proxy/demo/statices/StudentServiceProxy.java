package com.proxy.demo.statices;

/**
 * 静态代理
 * 代理类 和 被代理的对象 都实现 相同的接口
 * 
 * @author fangss
 *
 */
public class StudentServiceProxy implements IStudentService {

	private IStudentService studentService; // 代理类的的接口 
	
	public StudentServiceProxy(IStudentService studentService) {
		this.studentService = studentService;
	}



	@Override
	public void lean() {
		// 在被代理对象 调用方法之前操作自己的逻辑
		System.out.println(this.getClass().getName() + "----- 前 前 前 前 前");
		
		
		// 被代理对象  执行自己的方法
		studentService.lean();
		
		// 在代理对象 调用方法之后操作自己的逻辑
		System.out.println(this.getClass().getName() + "--- 后 后 后 后");
		

	}

}
