package com.java8.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

	public static void main(String args[]) {
		String filePath = "C:/Users/john/Desktop/零批接口/bodySql.sql";
		
		try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
			stream.forEach(System.out :: println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
