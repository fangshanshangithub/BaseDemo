package com.hadoop.chapter2;


import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TempertureMapper extends Mapper<Object, Text, Text, Text>{

	private static Text line = new Text();
	
	public void map(Object key ,Text value, Context context) throws IOException, InterruptedException{
		
		line = value;
		
		context.write(line, new Text(""));
	}
 
	
	
}
