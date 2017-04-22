package com.hadoop.chapter2;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TempertrueReducer extends Reducer<Text, Text, Text, Text>{

	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		
		context.write(key, new Text(""));
	}
	
}
