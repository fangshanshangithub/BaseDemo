package com.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class BeanFactoryTest {
	public static void main(String args[]) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:conf/bean.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		beanMethods(bf);
		moreBeanMethod(bf);
		fooMethod(bf);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	}

	private static void fooMethod(BeanFactory bf) {
		System.out.println("###############################");
		Foo foo = bf.getBean("foo",Foo.class);
		System.out.println(foo.toString());
	}

	private static void moreBeanMethod(BeanFactory bf) {
		System.out.println("=====================================");
		Car car1 = (Car) bf.getBean("com.test.spring.Car");
		Car car2 = (Car) bf.getBean("com.test.spring.Car#1");
		Car car3 = (Car) bf.getBean("com.test.spring.Car#2");
		System.out.println(car1.toString() + "\n" + car2.toString() + "\n" + car3.toString());
	}

	private static void beanMethods(BeanFactory bf) {
		System.out.println("init BeanFactory !!");
		
		/** xml 配置时 
		 *  <bean id="car" name="car1,cc" 
		 *  class="com.test.spring.Car"/>
		 *  这三个：
		 *  bf.getBean("cc",Car.class);
		 *  bf.getBean("car",Car.class);
		 *  bf.getBean("car1",Car.class);
		 *  等价
		 */
		Car car = bf.getBean("cc",Car.class);
		System.out.println(car.toString());
	}
}
