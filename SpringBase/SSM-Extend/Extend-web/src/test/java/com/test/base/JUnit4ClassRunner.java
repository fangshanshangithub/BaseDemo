package com.test.base;

import java.io.FileNotFoundException;

import org.junit.internal.runners.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

/**
 * 重写SpringJUnit4ClassRunner主要是支持log日志的打印
 * @author Fangss
 *
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
	static {
		try {
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot Initialize log4j");
		}
	}
	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError, org.junit.runners.model.InitializationError {
		super(clazz);
	}
}